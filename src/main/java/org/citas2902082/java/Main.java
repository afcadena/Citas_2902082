package org.citas2902082.java;

import org.citas2902082.java.entities.Medico;
import org.citas2902082.java.entities.Usuario;
import org.citas2902082.java.entities.enums.Especialidad;
import org.citas2902082.java.entities.enums.TipoIdentificacion;

public class Main {
    public static void main(String[] args) {

        Medico m = new Medico(3, "Andres", "Cadena", TipoIdentificacion.CC, 101323322L, 22334455L,
                Especialidad.Dermatologia);

        System.out.println(m.toString());

    }

}
