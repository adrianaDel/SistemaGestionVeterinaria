package com.mycompany.sistemagestionveterinaria;

import com.mycompany.sistemagestionveterinaria.entidades.Mascota;
import com.mycompany.sistemagestionveterinaria.persistencia.ControlMetodos;
import com.mycompany.sistemagestionveterinaria.persistencia.Registro;
import java.sql.SQLException;
/**
 *
 * @author Yanir
 */
public class SistemaGestionVeterinaria {

    public static Conexion conexion = new Conexion();

    public static void main(String[] args) throws SQLException {
     
        conexion.estableceConexion();
        
        ControlMetodos control = new ControlMetodos();
        
        Registro registro = new Registro (51, "Leon", "Perro", "Macho");
         
        conexion.cerrarConexion();
           
    }
    static void State() {

        Mascota mascota = new Mascota();

        System.out.println("La Mascota esta en Sala de Espera");
        System.out.println(mascota.getState());

        System.out.println("La mascota esta enferma");
        System.out.println(mascota.state.EstadoSalud());
        System.out.println(mascota.getState());

        System.out.println("La mascota debe recibir Medicamentos/Vacunas");
        System.out.println(mascota.state.EstadoVacunas());
        System.out.println(mascota.getState());
        
        System.out.println("La mascota esta lista para ser atendida");
        System.out.println(mascota.state.recibirAtencionMedica());
        System.out.println(mascota.getState());
        
    }
    }