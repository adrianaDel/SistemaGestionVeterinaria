package com.mycompany.sistemagestionveterinaria.persistencia;

import com.mycompany.sistemagestionveterinaria.controladores.ControllerRegistroJpa;

/**
 *
 * @author Yanir
 */
public class ControlMetodos {
    ControllerRegistroJpa controlPers = new ControllerRegistroJpa();

    public void crearRegistro(Registro registro) {

        controlPers.crearRegistro(registro);
    }
}