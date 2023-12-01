package template;

import com.mycompany.sistemagestionveterinaria.entidades.TurnoMedico;
/**
 *
 * @author Yanir
 */
public class TurnoGestion extends GestionVeterinariaTemplate{
    
    
    private TurnoMedico turnoMedico;
    
    @Override
    protected void validarTurno() {
   
        if (turnoMedico != null && turnoMedico.getFechaTurno() != null && turnoMedico.getVeterinario() != null && turnoMedico.getMascota() != null) {
            System.out.println("Turno válido: " + turnoMedico.toString());
        } else {
            System.out.println("El turno no es válido. Falta información.");
        }
    }

    @Override
    protected void asignarTurno() {
       
        System.out.println("Turno asignado al médico: " + turnoMedico.getVeterinario());
    }

    @Override
    protected void confirmarTurno() {
       
        System.out.println("Turno confirmado para: " + turnoMedico.getMascota());
    }
}