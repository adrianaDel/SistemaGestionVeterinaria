package com.mycompany.sistemagestionveterinaria.interfaces;

import com.mycompany.sistemagestionveterinaria.entidades.Mascota;
import com.mycompany.sistemagestionveterinaria.entidades.State;

/**
 *
 * @author Yanir
 */
public class EstadoEnfermo extends State {
        public EstadoEnfermo(Mascota mascota) {
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
        mascota.setState(new EstadoEnfermo(mascota));
        mascota.enfermo();
        return mascota.atencionMedica();
    }
}
