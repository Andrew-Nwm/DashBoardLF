package com.mycompany.lifemates_dashboard.persistencia;

import com.mycompany.lifemates_dashboard.logica.Password;
import com.mycompany.lifemates_dashboard.logica.Users;
import com.mycompany.lifemates_dashboard.persistencia.exceptions.PreexistingEntityException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ControladoraPersistencia {

    private final UsersJpaController usersJpa = new UsersJpaController();
    private final PasswordJpaController passwordJpa = new PasswordJpaController();
    private final EntityManagerFactory emf;

    public ControladoraPersistencia() {
        emf = Persistence.createEntityManagerFactory("LifeMatesPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void guardar(Users users, Password password) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        EntityTransaction tx = null;
        try {
            em = getEntityManager();
            tx = em.getTransaction();
            tx.begin();

            usersJpa.create(users);
            passwordJpa.create(password);

            tx.commit();
        } catch (PreexistingEntityException ex) {
            ex.printStackTrace(); 
            throw ex;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

}
