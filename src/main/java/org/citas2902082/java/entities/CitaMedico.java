package org.citas2902082.java.entities;

import java.time.LocalDateTime;

import org.citas2902082.java.entities.enums.TipoIdentificacion;
import org.citas2902082.java.entities.enums.EstadoCita;

public class CitaMedico extends Cita implements IAgendable {

    private String motivo;
    private Medico medico;
    private Estado estado;

    public CitaMedico(Integer id, String nombre, String apellido, TipoIdentificacion tipoIdentificacion,
            long numeroIdentificación, LocalDateTime fecha, Paciente paciente, String motivo, Medico medico) {
        super(id, nombre, apellido, tipoIdentificacion, numeroIdentificación, fecha, paciente);
        this.motivo = motivo;
        this.medico = medico;
    }

    @Override
    public void agendarCita(LocalDateTime fecha) {
        super.setFecha(fecha);

    }

    @Override
    public void cancelarCita(LocalDateTime fecha) {
        this.estado = EstadoCita.CANCELADA;

    }

    @Override
    public void reasignarrCita(LocalDateTime fecha) {
        super.setFecha(fecha);

    }

}
