
package com.mycompany.sistemagestionveterinaria.DAOs;

import com.mycompany.sistemagestionveterinaria.persistencia.Registro;
import java.util.List;

/**
 *
 * @author Yanir
 */
public interface RegistroDAOs {
    Registro obtenerPorId(int id);
    List<Registro> obtenerTodos();
    void guardar(Registro registro);
    void actualizar(Registro registro);
    void eliminar(int id);   
}