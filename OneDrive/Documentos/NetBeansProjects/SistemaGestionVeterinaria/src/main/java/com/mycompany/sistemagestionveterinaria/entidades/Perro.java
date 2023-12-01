package com.mycompany.sistemagestionveterinaria.entidades;
/**
 *
 * @author Yanir
 */
public class Perro extends Mascota{
      private String nombre;
      private int edad;

    public Perro(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }  

}