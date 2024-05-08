package com.mycompany.lifemates_dashboard.persistencia;

import com.mycompany.lifemates_dashboard.logica.Password;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.lifemates_dashboard.logica.Users;
import com.mycompany.lifemates_dashboard.persistencia.exceptions.NonexistentEntityException;
import com.mycompany.lifemates_dashboard.persistencia.exceptions.PreexistingEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author AndresRivasMosquera
 */
public class PasswordJpaController implements Serializable {

    public PasswordJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    public PasswordJpaController() {
        emf = Persistence.createEntityManagerFactory("LifeMatesPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Password password) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Users user = password.getUser();
            if (user != null) {
                user = em.getReference(user.getClass(), user.getUs_id_usuario());
                password.setUser(user);
            }
            em.persist(password);
            if (user != null) {
                Password oldPasswordOfUser = user.getPassword();
                if (oldPasswordOfUser != null) {
                    oldPasswordOfUser.setUser(null);
                    oldPasswordOfUser = em.merge(oldPasswordOfUser);
                }
                user.setPassword(password);
                user = em.merge(user);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findPassword(password.getCo_id_contrasenia()) != null) {
                throw new PreexistingEntityException("Password " + password + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Password password) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Password persistentPassword = em.find(Password.class, password.getCo_id_contrasenia());
            Users userOld = persistentPassword.getUser();
            Users userNew = password.getUser();
            if (userNew != null) {
                userNew = em.getReference(userNew.getClass(), userNew.getUs_id_usuario());
                password.setUser(userNew);
            }
            password = em.merge(password);
            if (userOld != null && !userOld.equals(userNew)) {
                userOld.setPassword(null);
                userOld = em.merge(userOld);
            }
            if (userNew != null && !userNew.equals(userOld)) {
                Password oldPasswordOfUser = userNew.getPassword();
                if (oldPasswordOfUser != null) {
                    oldPasswordOfUser.setUser(null);
                    oldPasswordOfUser = em.merge(oldPasswordOfUser);
                }
                userNew.setPassword(password);
                userNew = em.merge(userNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = password.getCo_id_contrasenia();
                if (findPassword(id) == null) {
                    throw new NonexistentEntityException("The password with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Password password;
            try {
                password = em.getReference(Password.class, id);
                password.getCo_id_contrasenia();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The password with id " + id + " no longer exists.", enfe);
            }
            Users user = password.getUser();
            if (user != null) {
                user.setPassword(null);
                user = em.merge(user);
            }
            em.remove(password);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Password> findPasswordEntities() {
        return findPasswordEntities(true, -1, -1);
    }

    public List<Password> findPasswordEntities(int maxResults, int firstResult) {
        return findPasswordEntities(false, maxResults, firstResult);
    }

    private List<Password> findPasswordEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Password.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Password findPassword(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Password.class, id);
        } finally {
            em.close();
        }
    }

    public int getPasswordCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Password> rt = cq.from(Password.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
