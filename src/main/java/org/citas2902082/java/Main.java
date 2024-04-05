package org.citas2902082.java;

import org.citas2902082.java.entities.Cita;
import org.citas2902082.java.entities.CitaMedico;
import org.citas2902082.java.entities.Consultorio;
import org.citas2902082.java.entities.Enfermero;
import org.citas2902082.java.entities.Medico;
import org.citas2902082.java.entities.Paciente;
import org.citas2902082.java.entities.Usuario;
import org.citas2902082.java.entities.enums.Especialidad;
import org.citas2902082.java.entities.Estado;
import org.citas2902082.java.entities.enums.Motivo;
import org.citas2902082.java.entities.enums.TipoIdentificacion;
import org.citas2902082.java.entities.enums.TipoSangre;
import org.citas2902082.java.entities.Consultorio;

import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        Consultorio Consultorio1 = new Consultorio("calle 12 # 25B", 1);
        Consultorio Consultorio2 = new Consultorio("calle 12 # 25B", 2);

        Medico medico1 = new Medico(3, "Andres", "Cadena", TipoIdentificacion.CC, 101323322L, 22334455L,
                Especialidad.Dermatologia);
        Medico medico2 = new Medico(2, "Esteban", "Piñeros", TipoIdentificacion.CE, 1029142018L, 8415459L,
                Especialidad.Medicia_General);

        Paciente paciente1 = new Paciente("Sara", "Rodriguez", TipoIdentificacion.TI, 1955755,
                "sara.rodriguez@correo.com", 315897456, LocalDateTime.of(1985, Month.APRIL, 5, 23, 34, 0), 1.65,
                60.00, TipoSangre.B, 'P');

        Paciente paciente2 = new Paciente("Juan", "Pérez", TipoIdentificacion.CC, 1002345678,
                "juan.perez@correo.com", 310234578, LocalDateTime.of(1990, 10, 12, 0, 0), 1.75,
                70.0, TipoSangre.A, 'P');

        Paciente paciente3 = new Paciente("María", "López", TipoIdentificacion.CE, 123456789,
                "maria.lopez@correo.com", 311467890, LocalDateTime.of(1995, 5, 20, 0, 0), 1.60,
                55.0, TipoSangre.AB, 'N');

        Paciente paciente4 = new Paciente("Pedro", "García", TipoIdentificacion.TI, 1003456789,
                "pedro.garcia@correo.com", 312568901, LocalDateTime.of(2000, 3, 14, 0, 0), 1.80,
                80.0, TipoSangre.O, 'P');

        Paciente paciente5 = new Paciente("Ana", "Ortiz", TipoIdentificacion.CC, 1004567890,
                "ana.ortiz@correo.com", 313678912, LocalDateTime.of(2005, 7, 25, 0, 0), 1.55,
                45.0, TipoSangre.AB, 'N');

        Enfermero enfermero1 = new Enfermero(1, "David", "Perez", TipoIdentificacion.CC, 21979724);
        Enfermero enfermero2 = new Enfermero(2, "Ana", "Gutiérrez", TipoIdentificacion.CE, 1005678901);
        Enfermero enfermero3 = new Enfermero(3, "Miguel", "Rodríguez", TipoIdentificacion.TI, 123456789);

        CitaMedico Cita1 = new CitaMedico(Estado.AGENDAR, LocalDateTime.of(2024, 4, 12, 12, 1, 0), paciente5,
                Consultorio2, Motivo.Gripa, medico2);
        CitaMedico Cita2 = new CitaMedico(Estado.AGENDAR, LocalDateTime.of(2024, 4, 15, 10, 5, 0), paciente3,
                Consultorio1, Motivo.Escopolamina, medico1);

        // Ver datos

        System.out.println("fecha: " + Cita1.getFecha() + "|" + "Consultorio: " + Cita1.getConsultorio().numero + "|"
                + "Medico: " + Cita1.getMedico().getNombres() + " " + Cita1.getMedico().getApellidos() + "|"
                + "Paciente: " + Cita1.getPaciente().nombres + " "
                + Cita1.getPaciente().apellidos);

        System.out.println("fecha: " + Cita2.getFecha() + "|" + "Consultorio: " + Cita2.getConsultorio().numero + "|"
                + "Medico: " + Cita2.getMedico().getNombres() + " " + Cita2.getMedico().getApellidos() + "|"
                + "Paciente: " + Cita2.getPaciente().nombres + " "
                + Cita2.getPaciente().apellidos);

        CitaMedico cancelarCita = Cita1;
        cancelarCita.setEstado(Estado.CANCELADA);

        System.out.println("El estado de la cita es: " + Cita1.getEstado());

    }

}
