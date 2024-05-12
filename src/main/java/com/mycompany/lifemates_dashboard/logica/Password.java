package com.mycompany.lifemates_dashboard.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;

@Entity
public class Password implements Serializable {

    @Id
    private String co_id_contrasenia;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "us_id_usuario", referencedColumnName = "us_id_usuario")
    private Users user;

    private String co_contrasenia; 
    private String co_fecha_creacion;
    private String co_historial_contrasenias;

    public Password() {
    }

    public Password(String co_id_contrasenia, String co_contrasenia, String co_fecha_creacion, String co_historial_contrasenias) {
        this.co_id_contrasenia = co_id_contrasenia;
        this.co_contrasenia = co_contrasenia;
        this.co_fecha_creacion = co_fecha_creacion;
        this.co_historial_contrasenias = co_historial_contrasenias;
    }

    public String getCo_id_contrasenia() {
        return co_id_contrasenia;
    }

    public void setCo_id_contrasenia(String co_id_contrasenia) {
        this.co_id_contrasenia = co_id_contrasenia;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String getCo_contrasenia() {
        return co_contrasenia;
    }

    public void setCo_contrasenia(String co_contrasenia) {
        this.co_contrasenia = co_contrasenia;
    }

    public String getCo_fecha_creacion() {
        return co_fecha_creacion;
    }

    public void setCo_fecha_creacion(String co_fecha_creacion) {
        this.co_fecha_creacion = co_fecha_creacion;
    }

    public String getCo_historial_contrasenias() {
        return co_historial_contrasenias;
    }

    public void setCo_historial_contrasenias(String co_historial_contrasenias) {
        this.co_historial_contrasenias = co_historial_contrasenias;
    }

}
