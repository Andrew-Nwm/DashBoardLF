package com.mycompany.lifemates_dashboard.logica;

import com.mycompany.lifemates_dashboard.persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String color, String observaciones, String alergico, String atenEsp, String nomDuenio, String telDuenio, String dirDuenio) {
        Duenio duenio = new Duenio();
        duenio.setNombre(nomDuenio);
        duenio.setCelDuenio(telDuenio);
        duenio.setDirDuenio(dirDuenio);
                        
        Mascota masco = new Mascota();
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEsp);
        masco.setObservaciones(observaciones);
        masco.setUnDuenio(duenio);
        
        controlPersis.guardar(duenio, masco);
        
        
    }
}