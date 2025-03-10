package com.proyecto.buckys_vet.servicio;

import java.util.Collection;
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
        return mascotaRepositorio.findAll();
    }
    public void guardar(Mascota mascota) {
        mascotaRepositorio.save(mascota);
    }


    public void update (Mascota mascota) {
        mascotaRepositorio.save (mascota);
    }    

    public void eliminar(Long id) {
        mascotaRepositorio.deleteById(id);
    }
   
    public Mascota obtenerPorId(Long id) {
        return mascotaRepositorio.findById(id).get();
    }
/*
    public Map<String, Mascota> obtenerPorDueno(String cedula) {
        Map<String, Mascota> mascotasDelDueno = new HashMap<>();
    
        for (Mascota mascota : mascotaRepositorio.obtenerTodas()) {
            if (mascota.getDuenoCedula().equals(cedula)) {
                mascotasDelDueno.put(mascota.getId().toString(), mascota);
            }
        }
        return mascotasDelDueno;
    }*/
    
}
