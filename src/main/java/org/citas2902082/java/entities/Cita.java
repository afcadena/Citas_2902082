package org.citas2902082.java.entities;

import java.time.LocalDateTime;

import org.citas2902082.java.entities.enums.TipoIdentificacion;

public class Cita extends Enfermero {
    private LocalDateTime fecha;
    private Paciente paciente;

    public Cita(Integer id, String nombre, String apellido, TipoIdentificacion tipoIdentificacion,
            long numeroIdentificación, LocalDateTime fecha, Paciente paciente) {
        super(id, nombre, apellido, tipoIdentificacion, numeroIdentificación);
        this.fecha = fecha;
        this.paciente = paciente;
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

}
