package org.citas2902082.java.entities;

import java.time.LocalDateTime;

import org.citas2902082.java.entities.enums.Motivo;

public class Cita { // extends Enfermero

    protected Estado estado;
    protected LocalDateTime fecha;
    protected Paciente paciente;
    protected Consultorio consultorio;
    protected Motivo motivo;
    protected Medico Medico;

    public Cita() {
    }

    public Cita(Estado estado, LocalDateTime fecha, Paciente paciente, Consultorio consultorio) {
        this.estado = estado;
        this.fecha = fecha;
        this.paciente = paciente;
        this.consultorio = consultorio;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

}
