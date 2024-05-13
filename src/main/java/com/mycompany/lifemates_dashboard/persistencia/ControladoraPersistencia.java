package com.mycompany.lifemates_dashboard.persistencia;

import com.mycompany.lifemates_dashboard.logica.Duenio;
import com.mycompany.lifemates_dashboard.logica.Mascota;
import com.mycompany.lifemates_dashboard.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {

        //Creando a Dueño en la BD
        duenioJpa.create(duenio);

        //Creando a Mascota en la BD
        mascoJpa.create(masco);

    }

    public List<Mascota> traerMascotas() {

        return mascoJpa.findMascotaEntities();

    }

    public void borrarMascota(int num_cliente) {
        try {
            mascoJpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
