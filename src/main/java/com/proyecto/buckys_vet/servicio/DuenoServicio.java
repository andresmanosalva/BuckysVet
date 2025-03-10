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
        return duenoRepositorio.findAll();
    }

    // Método para obtener un dueño por cédula
    public Dueno obtenerPorCedula(Long id) {
        return duenoRepositorio.findById(id).get();
    }

    // Método para guardar o actualizar un dueño
    public void guardar(Dueno dueno) {
        duenoRepositorio.save(dueno);
    }

    // Método para eliminar un dueño por cédula
    public void eliminar(Long id) {
        duenoRepositorio.deleteById(id);
    }

     public void update (Dueno dueno) {
        duenoRepositorio.save(dueno);
    }    

}
