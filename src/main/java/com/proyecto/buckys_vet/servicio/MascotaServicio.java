package com.proyecto.buckys_vet.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.buckys_vet.entidad.Mascota;
import com.proyecto.buckys_vet.repositorio.MascotaRepositorio;

@Service
public class MascotaServicio {

    @Autowired
    private MascotaRepositorio mascotaRepositorio;

    // Obtener todas las mascotas
    public List<Mascota> obtenerTodas() {
        return mascotaRepositorio.obtenerTodas();
    }

    public Mascota obtenerPorNombre(String nombre) {
        return mascotaRepositorio.obtenerPorNombre(nombre);
    }
}
