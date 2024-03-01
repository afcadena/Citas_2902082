package org.citas2902082.java.entities;
import java.time.LocalDateTime;

public class Cita {

    public Integer id;
    public LocalDateTime fecha;
    public Medico medico;
    public Consultorio Consultorio;
    public Paciente Paciente;
    
    public Cita(LocalDateTime fecha, Medico medico, Consultorio consultorio,
            Paciente paciente) {
        this.fecha = fecha;
        this.medico = medico;
        this.Consultorio = consultorio;
        this.Paciente = paciente;
    }
    
}
