package com.mycompany.lifemates_dashboard.logica;

import com.mycompany.lifemates_dashboard.persistencia.ControladoraPersistencia;
import java.util.List;

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

    public List<Mascota> traerMascotas() {
        return controlPersis.traerMascotas();
    }

    public void borrarMascota(int num_cliente) {
        controlPersis.borrarMascota(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
        return controlPersis.traerMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco, String nombreMasco, String raza, String color, String observaciones, String alergico, String atenEsp, String nomDuenio, String celDuenio, String dirDuenio) {
//settear valores para la mascota
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(observaciones);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEsp);
        controlPersis.modificarMascota(masco);
//settear valores para el dueño
        Duenio dueno = this.busarDuenio(masco.getUnDuenio().getId_duenio());
        dueno.setNombre(nomDuenio);
        dueno.setCelDuenio(celDuenio);
        dueno.setDirDuenio(dirDuenio);
        this.modificarDuenio(dueno);
    }

    private Duenio busarDuenio(int id_duenio) {
        return controlPersis.traerDuenio(id_duenio);
    }

    private void modificarDuenio(Duenio dueno) {
        controlPersis.modificarDuenio(dueno);
    }

    public void borrarDuenio(int num_cliente) {
        controlPersis.borrarDuenio(num_cliente);
    }
}
