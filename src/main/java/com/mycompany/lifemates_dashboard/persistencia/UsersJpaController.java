package com.mycompany.lifemates_dashboard.persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.lifemates_dashboard.logica.Password;
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
public class UsersJpaController implements Serializable {

    public UsersJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    public UsersJpaController() {
        emf = Persistence.createEntityManagerFactory("LifeMatesPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Users users) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Password password = users.getPassword();
            if (password != null) {
                password = em.getReference(password.getClass(), password.getCo_id_contrasenia());
                users.setPassword(password);
            }
            em.persist(users);
            if (password != null) {
                Users oldUserOfPassword = password.getUser();
                if (oldUserOfPassword != null) {
                    oldUserOfPassword.setPassword(null);
                    oldUserOfPassword = em.merge(oldUserOfPassword);
                }
                password.setUser(users);
                password = em.merge(password);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findUsers(users.getUs_id_usuario()) != null) {
                throw new PreexistingEntityException("Users " + users + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Users users) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Users persistentUsers = em.find(Users.class, users.getUs_id_usuario());
            Password passwordOld = persistentUsers.getPassword();
            Password passwordNew = users.getPassword();
            if (passwordNew != null) {
                passwordNew = em.getReference(passwordNew.getClass(), passwordNew.getCo_id_contrasenia());
                users.setPassword(passwordNew);
            }
            users = em.merge(users);
            if (passwordOld != null && !passwordOld.equals(passwordNew)) {
                passwordOld.setUser(null);
                passwordOld = em.merge(passwordOld);
            }
            if (passwordNew != null && !passwordNew.equals(passwordOld)) {
                Users oldUserOfPassword = passwordNew.getUser();
                if (oldUserOfPassword != null) {
                    oldUserOfPassword.setPassword(null);
                    oldUserOfPassword = em.merge(oldUserOfPassword);
                }
                passwordNew.setUser(users);
                passwordNew = em.merge(passwordNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = users.getUs_id_usuario();
                if (findUsers(id) == null) {
                    throw new NonexistentEntityException("The users with id " + id + " no longer exists.");
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
            Users users;
            try {
                users = em.getReference(Users.class, id);
                users.getUs_id_usuario();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The users with id " + id + " no longer exists.", enfe);
            }
            Password password = users.getPassword();
            if (password != null) {
                password.setUser(null);
                password = em.merge(password);
            }
            em.remove(users);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Users> findUsersEntities() {
        return findUsersEntities(true, -1, -1);
    }

    public List<Users> findUsersEntities(int maxResults, int firstResult) {
        return findUsersEntities(false, maxResults, firstResult);
    }

    private List<Users> findUsersEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Users.class));
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

    public Users findUsers(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Users.class, id);
        } finally {
            em.close();
        }
    }

    public int getUsersCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Users> rt = cq.from(Users.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
