package com.mycompany.sistemagestionveterinaria.entidades;
/**
 *
 * @author Yanir
 */
public abstract class State {
     public Mascota mascota;

    public State(Mascota mascota) {
        this.mascota = mascota;
    }
    
    public abstract String EstadoSalud();
    public abstract String EstadoVacunas();
    public abstract String recibirAtencionMedica();
}
