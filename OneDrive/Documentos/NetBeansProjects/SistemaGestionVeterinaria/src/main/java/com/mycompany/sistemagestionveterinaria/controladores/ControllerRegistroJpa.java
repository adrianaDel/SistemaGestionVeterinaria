package com.mycompany.sistemagestionveterinaria.controladores;

import com.mycompany.sistemagestionveterinaria.persistencia.Registro;
/**
 *
 * @author Yanir
 */
public class ControllerRegistroJpa {
     ControllerRegistroJpa registroJpa = new ControllerRegistroJpa ();

    public void crearRegistro(Registro registro) {
        registroJpa.create(registro);
    }

    private void create(Registro registro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}