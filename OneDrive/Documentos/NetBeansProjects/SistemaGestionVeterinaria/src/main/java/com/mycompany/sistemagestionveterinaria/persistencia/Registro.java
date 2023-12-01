
package com.mycompany.sistemagestionveterinaria.persistencia;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Yanir
 */

@Entity
@Table(name = "REGISTRO")

public class Registro implements Serializable {
   
    @Id
    @Column(name= "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int edad;
    
    @Column(name = "nombre")
    private String nombre; 
    @Column(name = "especie")
    private String especie;
     @Column(name = "genero")
    private String genero;
    
    public Registro() {
    }

    public Registro(int edad, String nombre, String especie, String genero) {
        this.edad = edad;
        this.nombre = nombre;
        this.especie = especie;
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    }