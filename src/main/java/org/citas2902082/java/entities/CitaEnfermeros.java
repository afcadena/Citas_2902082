package org.citas2902082.java.entities;

import java.time.LocalDateTime;

import org.citas2902082.java.entities.enums.TipoIdentificacion;

public class CitaEnfermeros extends Cita implements IAgendable {
    private String procedimiento;
    private Enfermero enfermeros;

    public CitaEnfermeros(Estado estado, LocalDateTime fecha, Paciente paciente, Consultorio consultorio,
            String procedimiento, Enfermero enfermeros) {
        super(estado, fecha, paciente, consultorio);
        this.procedimiento = procedimiento;
        this.enfermeros = enfermeros;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public Enfermero getEnfermeros() {
        return enfermeros;
    }

    public void setEnfermeros(Enfermero enfermeros) {
        this.enfermeros = enfermeros;
    }

    @Override
    public void agendarCita(LocalDateTime fecha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agendarCita'");
    }

    @Override
    public void cancelarCita() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelarCita'");
    }

    @Override
    public void reasignarCita(LocalDateTime fecha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reasignarCita'");
    }

}
