package com.mycompany.lifemates_dashboard.logica;

import com.mycompany.lifemates_dashboard.persistencia.ControladoraPersistencia;
import com.mycompany.lifemates_dashboard.persistencia.exceptions.PreexistingEntityException;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class Controladora {

    private ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    private EntityManager em = null;

    private EntityManager getEntityManager() {
        if (em == null || !em.isOpen()) {
            em = controlPersis.getEntityManager();
        }
        return em;
    }

    private void closeEntityManager() {
        if (em != null && em.isOpen()) {
            em.close();
        }
    }

    public void guardar(String us_id_usuario, String pr_id_persona, String us_nombre_usuario, String us_documento, String co_id_contrasenia, String co_contrasenia, String co_fecha_creacion, String co_historial_contrasenias, String us_fecha_creacion) throws PreexistingEntityException, Exception {
        EntityTransaction tx = null;
        try {
            em = getEntityManager();
            tx = em.getTransaction();
            tx.begin();

            // Realizar operaciones de persistencia
            Users users = new Users();
            Password password = new Password();

            password.setCo_id_contrasenia(co_id_contrasenia);
            password.setCo_contrasenia(co_contrasenia);
            password.setCo_fecha_creacion(co_fecha_creacion);
            password.setCo_historial_contrasenias(co_historial_contrasenias);

            users.setPassword(password);
            users.setPr_id_persona(pr_id_persona);
            users.setUs_documento(us_documento);
            users.setUs_fecha_creacion(us_fecha_creacion);
            users.setUs_id_usuario(us_id_usuario);
            users.setUs_nombre_usuario(us_nombre_usuario);

            password.setUser(users);

            controlPersis.guardar(users, password);

            tx.commit(); // Confirmar los cambios después de las operaciones de persistencia
        } catch (Exception ex) {
            if (tx != null && tx.isActive()) {
                tx.rollback(); // Realizar rollback en caso de excepción
            }
            throw ex;
        } finally {
            closeEntityManager(); // Cerrar el EntityManager correctamente
        }
    }
}
