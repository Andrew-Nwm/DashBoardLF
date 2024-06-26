package com.mycompany.lifemates_dashboard.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Duenio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_duenio;
    private String nombre;
    private String celDuenio;
    private String dirDuenio;

    public Duenio() {
    }

    public Duenio(int id_duenio, String nombre, String celDuenio, String dirDuenio) {
        this.id_duenio = id_duenio;
        this.nombre = nombre;
        this.celDuenio = celDuenio;
        this.dirDuenio = dirDuenio;
    }

    public int getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(int id_duenio) {
        this.id_duenio = id_duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelDuenio() {
        return celDuenio;
    }

    public void setCelDuenio(String celDuenio) {
        this.celDuenio = celDuenio;
    }

    public String getDirDuenio() {
        return dirDuenio;
    }

    public void setDirDuenio(String dirDuenio) {
        this.dirDuenio = dirDuenio;
    }
}
