package org.citas2902082.java.entities;

import java.time.LocalDateTime;

import org.citas2902082.java.entities.enums.TipoIdentificacion;

public class CitaEnfermeros extends Cita {
    private String procedimiento;
    private Enfermeros enfermeros;

    public CitaEnfermeros(Integer id, String nombre, String apellido, TipoIdentificacion tipoIdentificacion,
            long numeroIdentificación, LocalDateTime fecha, Paciente paciente, String procedimiento,
            Enfermeros enfermeros) {
        super(id, nombre, apellido, tipoIdentificacion, numeroIdentificación, fecha, paciente);
        this.procedimiento = procedimiento;
        this.enfermeros = enfermeros;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public Enfermeros getEnfermeros() {
        return enfermeros;
    }

    public void setEnfermeros(Enfermeros enfermeros) {
        this.enfermeros = enfermeros;
    }

}
