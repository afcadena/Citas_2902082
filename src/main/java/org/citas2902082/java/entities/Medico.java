package org.citas2902082.java.entities;

import org.citas2902082.java.entities.enums.TipoIdentificacion;
import org.citas2902082.java.entities.enums.Especialidad;

public class Medico extends Usuario {

    private Long registroMedico;
    private Especialidad especialidad;

    public Medico(Integer id,
            String nombres,
            String apellidos,
            TipoIdentificacion tipoIdentificacion,
            Long numeroIdentificación,
            Long registroMedico,
            Especialidad especialidad) {

        // Constructor de la clase padre trae todos los atributos
        // En un constructor de la clase hijas es lo primero que debe aparecer

        super(apellidos, nombres, apellidos, tipoIdentificacion, numeroIdentificación);

        // Inicializar los atributos propios de la clase padre

        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

    public Long getRegistroMedico() {
        return registroMedico;
    }

    public void setRegistroMedico(Long registroMedico) {
        this.registroMedico = registroMedico;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
    // toString

    @Override
    public String toString() {
        return super.toString() +
                "Medico [registroMedico=" + registroMedico + ", especialidad=" + especialidad + "]";
    }

}
