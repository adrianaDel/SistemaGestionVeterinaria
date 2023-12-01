package com.mycompany.sistemagestionveterinaria.entidades;

import com.mycompany.sistemagestionveterinaria.interfaces.EstadoDiagnostico;
/**
 *
 * @author Yanir
 */
public class Mascota {
      private String especie;
      private String raza;
      private String genero;
      public State state;
      
    public Mascota(String especie, String raza, String genero) {
        this.especie = especie;
        this.raza = raza;
        this.genero = genero;
        this.state = state;
    }
    public Mascota(){
           state = new EstadoDiagnostico(this);
    }
     
    public String enfermo(){
    return "La Mascota esta Enferma";
    }
    
    public String medicamento(){
    return "La Mascota debe tomar medicamentos y/o Vacunas asignadas";
    }
       
    public String atencionMedica(){
    return "La Mascota sera atendida por Veterinario";
    }
    
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }     
    
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}