package org.citas2902082.java.entities;

import org.citas2902082.java.entities.enums.TipoIdentificacion;

public class Usuario {

    protected String id;
    protected String nombres;
    protected String apellidos;
    protected TipoIdentificacion tipoIdentificacion;
    protected Long numeroIdentificación;

    public Usuario() {
    }

    public Usuario(String id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            Long numeroIdentificación) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificación = numeroIdentificación;

    }

    // Setters

    public void setId(String id) {
        this.id = id;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public void setNumeroIdentificación(Long numeroIdentificación) {
        this.numeroIdentificación = numeroIdentificación;
    }

    // Getters

    public String getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public TipoIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public Long getNumeroIdentificación() {
        return numeroIdentificación;
    }

    // Definir el metodo toString

    @Override // Se sobreescribe la informacion
    public String toString() {
        return "Usuario [nombres= " + nombres + ", apellidos= " + apellidos + "]";
    }

}
