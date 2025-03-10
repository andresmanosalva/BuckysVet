package com.proyecto.buckys_vet.servicio;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.buckys_vet.entidad.Dueno;
import com.proyecto.buckys_vet.repositorio.DuenoRepositorio;

@Service
public class DuenoServicio {
    
    @Autowired
    public DuenoRepositorio duenoRepositorio;

    // Método para obtener todos los dueños
    public Collection<Dueno> obtenerTodos() {
        return duenoRepositorio.obtenerTodos();
    }

    // Método para obtener un dueño por cédula
    public Dueno obtenerPorCedula(String cedula) {
        return duenoRepositorio.obtenerPorCedula(cedula);
    }

    // Método para guardar o actualizar un dueño
    public void guardar(Dueno dueno) {
        duenoRepositorio.agregar(dueno);
    }

    // Método para eliminar un dueño por cédula
    public void eliminar(String cedula) {
        duenoRepositorio.eliminar(cedula);
    }

     public void update (Dueno dueno) {
        duenoRepositorio.modificar(dueno);
    }    

}
