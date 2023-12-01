package template;
/**
 *
 * @author Yanir
 */
public abstract class GestionVeterinariaTemplate {
     public final void gestionarTurno() {
        validarTurno();
        asignarTurno();
        confirmarTurno();
    }
     
    protected abstract void validarTurno();

    protected abstract void asignarTurno();

    protected abstract void confirmarTurno();
 
    } 