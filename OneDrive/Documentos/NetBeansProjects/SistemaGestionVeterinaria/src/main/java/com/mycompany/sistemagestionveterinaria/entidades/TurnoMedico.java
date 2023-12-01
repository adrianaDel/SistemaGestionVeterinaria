package com.mycompany.sistemagestionveterinaria.entidades;

import java.time.LocalDateTime;

/**
 *
 * @author Yanir
 */
public class TurnoMedico {
      private String Nombre ;
      private String Turno ;
      private String veterinario;
      private String motivoVisita;
      private String mascota;
      private boolean aprobado;
      private LocalDateTime fechaTurno;

    public TurnoMedico(String Nombre,String Turno, String veterinario, String motivoVisita, String mascota, boolean aprobado) {
        this.Nombre = Nombre;
        this.Turno = Turno;
        this.veterinario = veterinario;
        this.motivoVisita = motivoVisita;
        this.mascota = mascota;
        this.aprobado = aprobado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public TurnoMedico(LocalDateTime fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    public LocalDateTime getFechaTurno() {
        return fechaTurno;
    }

    public void setFechaTurno(LocalDateTime fechaTurno) {
        this.fechaTurno = fechaTurno;
    }
  
   
    public String getTurno() {
        return Turno;
    }

    public void setTurno(String Turno) {
        this.Turno = Turno;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    public String getMotivoVisita() {
        return motivoVisita;
    }

    public void setMotivoVisita(String motivoVisita) {
        this.motivoVisita = motivoVisita;
    }

    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }  

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

    
}