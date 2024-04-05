package org.citas2902082.java.entities;

import java.time.LocalDateTime;

import org.citas2902082.java.entities.enums.Motivo;

public class CitaMedico extends Cita implements IAgendable {

    private Motivo motivo;
    private Medico medico;
    private Estado estado;

    public CitaMedico(Estado estado, LocalDateTime fecha, Paciente paciente, Consultorio consultorio, Motivo motivo,
            org.citas2902082.java.entities.Medico medico) {
        super(estado, fecha, paciente, consultorio);
        this.motivo = motivo;
        this.medico = medico;
    }

    public Motivo getMotivo() {
        return motivo;
    }

    public void setMotivo(Motivo motivo) {
        this.motivo = motivo;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public void agendarCita(LocalDateTime fecha) {
        super.setFecha(fecha);
    }

    @Override
    public void cancelarCita() {
        System.out.println("CITA CANCELADA");
    }

    @Override
    public void reasignarCita(LocalDateTime fecha) {
        super.setFecha(fecha);
    }

}
