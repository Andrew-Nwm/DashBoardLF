package com.mycompany.lifemates_dashboard.logica;

import com.mycompany.lifemates_dashboard.persistencia.ControladoraPersistencia;
import com.mycompany.lifemates_dashboard.persistencia.exceptions.PreexistingEntityException;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void guardar(String us_id_usuario, String pr_id_persona, String us_nombre_usuario, String us_documento, String co_id_contrasenia, String co_contrasenia, String co_fecha_creacion, String co_historial_contrasenias, String us_fecha_creacion) {
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

        try {
            controlPersis.guardar(users, password);
        } catch (PreexistingEntityException ex) {
            // Manejo de la excepción PreexistingEntityException
            System.err.println("Ya existe una entidad con la misma clave primaria.");
            ex.printStackTrace(); // Imprime la traza de la excepción para propósitos de depuración
        } catch (Exception ex) {
            // Manejo de otras excepciones
            System.err.println("Ocurrió un error durante el proceso de guardado.");
            ex.printStackTrace(); // Imprime la traza de la excepción para propósitos de depuración
        }
    }
}