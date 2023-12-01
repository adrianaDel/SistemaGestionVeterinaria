package com.mycompany.sistemagestionveterinaria.interfaces;

import com.mycompany.sistemagestionveterinaria.entidades.Mascota;
import com.mycompany.sistemagestionveterinaria.entidades.State;
/**
 *
 * @author Yanir
 */
public abstract class EstadoAtencionMedica extends State{
    
        public EstadoAtencionMedica(Mascota mascota) {
        super(mascota);
    }

    @Override
    public String EstadoSalud() {
        mascota.setState(new EstadoEnfermo(mascota));
        mascota.enfermo();
        return mascota.medicamento();
    }
    @Override
    public String EstadoVacunas() {
        mascota.setState(new EstadoMedicamento(mascota));
        mascota.enfermo();
        return mascota.medicamento();
    }
    
    @Override
      public String recibirAtencionMedica() {
      mascota.setState(new EstadoDiagnostico(mascota));
      mascota.enfermo();
      return mascota.atencionMedica();
    }
}
 