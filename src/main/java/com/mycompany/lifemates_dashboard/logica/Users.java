package com.mycompany.lifemates_dashboard.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.FetchType;
import javax.persistence.CascadeType;

@Entity
public class Users implements Serializable {

    @Id
    private String us_id_usuario;
    private String pr_id_persona;
    private String us_nombre_usuario;
    private String us_documento;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL)
    private Password password;

    private String us_fecha_creacion;

    public Users() {
    }

    public Users(String us_id_usuario, String pr_id_persona, String us_nombre_usuario, String us_documento, Password password, String us_fecha_creacion) {
        this.us_id_usuario = us_id_usuario;
        this.pr_id_persona = pr_id_persona;
        this.us_nombre_usuario = us_nombre_usuario;
        this.us_documento = us_documento;
        this.password = password;
        this.us_fecha_creacion = us_fecha_creacion;
    }

    public String getUs_id_usuario() {
        return us_id_usuario;
    }

    public void setUs_id_usuario(String us_id_usuario) {
        this.us_id_usuario = us_id_usuario;
    }

    public String getPr_id_persona() {
        return pr_id_persona;
    }

    public void setPr_id_persona(String pr_id_persona) {
        this.pr_id_persona = pr_id_persona;
    }

    public String getUs_nombre_usuario() {
        return us_nombre_usuario;
    }

    public void setUs_nombre_usuario(String us_nombre_usuario) {
        this.us_nombre_usuario = us_nombre_usuario;
    }

    public String getUs_documento() {
        return us_documento;
    }

    public void setUs_documento(String us_documento) {
        this.us_documento = us_documento;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    public String getUs_fecha_creacion() {
        return us_fecha_creacion;
    }

    public void setUs_fecha_creacion(String us_fecha_creacion) {
        this.us_fecha_creacion = us_fecha_creacion;
    }
}
