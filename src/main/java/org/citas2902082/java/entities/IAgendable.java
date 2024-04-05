package org.citas2902082.java.entities;

import java.time.LocalDateTime;

public interface IAgendable {

    public void agendarCita(LocalDateTime fecha);

    public void cancelarCita();

    public void reasignarCita(LocalDateTime fecha);

}
