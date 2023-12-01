package com.mycompany.sistemagestionveterinaria.DAOs;

import com.mycompany.sistemagestionveterinaria.controladores.RegistroJpaController;
import com.mycompany.sistemagestionveterinaria.controladores.exceptions.NonexistentEntityException;
import com.mycompany.sistemagestionveterinaria.persistencia.Registro;
import java.util.List;
/**
 *
 * @author Yanir
 */
public class RegistroRepository implements RegistroDAOs {
   
        
    public RegistroJpaController ControllerRegistroJpa;
    
    public RegistroRepository() {
        this.ControllerRegistroJpa = new RegistroJpaController ();
    }

    @Override
    public Registro obtenerPorId(int id) {
        return ControllerRegistroJpa.findRegistro(id);
    }

    @Override
    public List<Registro> obtenerTodos() {
        return ControllerRegistroJpa.findRegistroEntities();
    }

    @Override
    public void guardar(Registro registro) {
       ControllerRegistroJpa.create(registro);
    }

    @Override
    public void actualizar(Registro registro) {
        try {
           ControllerRegistroJpa.edit(registro);
        } catch (Exception e) {
                e.printStackTrace();
        }
        
    }

    @Override
    public void eliminar(int id) {
        try {
            ControllerRegistroJpa.destroy(id);
        } catch (NonexistentEntityException e) {
            e.printStackTrace();
        }
    }
}    