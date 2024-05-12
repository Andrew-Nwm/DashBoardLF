package com.mycompany.lifemates_dashboard.persistencia;

import com.mycompany.lifemates_dashboard.logica.Duenio;
import com.mycompany.lifemates_dashboard.logica.Mascota;

public class ControladoraPersistencia {

    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {

        //Creando a Dueño en la BD
        duenioJpa.create(duenio);

        //Creando a Mascota en la BD
        mascoJpa.create(masco);

    }

}
