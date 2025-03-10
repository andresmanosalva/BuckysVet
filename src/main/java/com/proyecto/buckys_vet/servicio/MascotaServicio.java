package com.proyecto.buckys_vet.servicio;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.buckys_vet.entidad.Mascota;
import com.proyecto.buckys_vet.repositorio.MascotaRepositorio;

@Service
public class MascotaServicio {

    @Autowired
    public MascotaRepositorio mascotaRepositorio;

    // Obtener todas las mascotas
    public Collection<Mascota> obtenerTodas() {
        return mascotaRepositorio.obtenerTodas();
    }

    public Mascota obtenerPorNombre(String nombre) {
        return mascotaRepositorio.obtenerPorNombre(nombre);
    }

    public void guardar(Mascota mascota) {
        mascotaRepositorio.agregar(mascota);
    }


    public void update (Mascota mascota) {
        mascotaRepositorio.modificar(mascota);
    }    

    public void eliminar(Long id) {
        mascotaRepositorio.eliminar(id);
    }
   
    public Mascota obtenerPorId(Long id) {
        return mascotaRepositorio.obtenerPorId(id);
    }

    public Map<String, Mascota> obtenerPorDueno(String cedula) {
        Map<String, Mascota> mascotasDelDueno = new HashMap<>();
    
        for (Mascota mascota : mascotaRepositorio.obtenerTodas()) {
            if (mascota.getDuenoCedula().equals(cedula)) {
                mascotasDelDueno.put(mascota.getId().toString(), mascota);
            }
        }
        return mascotasDelDueno;
    }
    
}
