package com.proyecto.buckys_vet.repositorio;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.proyecto.buckys_vet.entidad.Dueno;
import com.proyecto.buckys_vet.entidad.Mascota;

@Repository
public class MascotaRepositorio {

    private Map<Long, Mascota> mapaMascotas = new HashMap<>();
    DuenoRepositorio duenoRepositorio = new DuenoRepositorio();
    Mascota mascota = new Mascota();

    public MascotaRepositorio() {
        mapaMascotas.put(1L, new Mascota(1L, "Bucky", "Perro", 4, 15.2, "Ninguna", "https://plus.unsplash.com/premium_photo-1694819488591-a43907d1c5cc?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8cGVycm98ZW58MHx8MHx8fDA%3D", "1234"));
        mapaMascotas.put(2L, new Mascota(2L, "Luna", "Gato", 2, 5.3, "Alergia alimentaria", "https://plus.unsplash.com/premium_photo-1673967831980-1d377baaded2?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8Z2F0b3N8ZW58MHx8MHx8fDA%3D", "5678"));
        mapaMascotas.put(3L, new Mascota(3L, "Simba", "Gato", 3, 7.8, "Ninguna", "https://images.unsplash.com/photo-1536589961747-e239b2abbec2?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Nnx8Z2F0b3N8ZW58MHx8MHx8fDA%3D", "9012"));
        mapaMascotas.put(4L, new Mascota(4L, "Coco", "Perro", 1, 8.5, "Parvovirus", "https://images.unsplash.com/photo-1517849845537-4d257902454a?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8N3x8cGVycm98ZW58MHx8MHx8fDA%3D", "3456"));
        mapaMascotas.put(5L, new Mascota(5L, "Rocky", "Perro", 5, 20.3, "Displasia de cadera", "https://images.unsplash.com/photo-1583511655826-05700d52f4d9?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NDZ8fHBlcnJvfGVufDB8fDB8fHww", "7890"));
        mapaMascotas.put(6L, new Mascota(6L, "Bella", "Gato", 4, 6.1, "Ninguna", "https://images.unsplash.com/photo-1582725461742-8ecd962c260d?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzF8fGdhdG9zfGVufDB8fDB8fHww", "1234"));
        mapaMascotas.put(7L, new Mascota(7L, "Max", "Perro", 7, 12.4, "Artrosis", "https://images.unsplash.com/photo-1575859431774-2e57ed632664?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NDh8fHBlcnJvfGVufDB8fDB8fHww", "5678"));
        mapaMascotas.put(8L, new Mascota(8L, "Milo", "Gato", 1, 4.5, "Ninguna", "https://images.unsplash.com/flagged/photo-1557427161-4701a0fa2f42?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzB8fGdhdG9zfGVufDB8fDB8fHww", "9012"));
        mapaMascotas.put(9L, new Mascota(9L, "Toby", "Perro", 2, 10.0, "Infección en el oído", "https://images.unsplash.com/photo-1596492784531-6e6eb5ea9993?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mjh8fHBlcnJvfGVufDB8fDB8fHww", "3456"));
        mapaMascotas.put(10L, new Mascota(10L, "Rex", "Perro", 6, 25.1, "Ninguna", "https://images.unsplash.com/photo-1491604612772-6853927639ef?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzJ8fHBlcnJvfGVufDB8fDB8fHww", "7890"));
        mapaMascotas.put(11L, new Mascota(11L, "Maggie", "Perro", 8, 18.7, "Cataratas", "https://images.unsplash.com/photo-1591946559594-8c6d3b7391eb?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NTh8fHBlcnJvfGVufDB8fDB8fHww", "1234"));
        mapaMascotas.put(12L, new Mascota(12L, "Charlie", "Gato", 5, 6.0, "Insuficiencia renal", "https://images.unsplash.com/photo-1606509769472-7660d4a478ac?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NTR8fGdhdG9zfGVufDB8fDB8fHww", "5678"));
        mapaMascotas.put(13L, new Mascota(13L, "Sasha", "Gato", 3, 5.8, "Ninguna", "https://images.unsplash.com/photo-1530305016043-f725a9268648?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NjN8fGdhdG9zfGVufDB8fDB8fHww", "9012"));
        mapaMascotas.put(14L, new Mascota(14L, "Duke", "Perro", 2, 13.0, "Dermatitis", "https://images.unsplash.com/photo-1546491764-67a5b8d5b3ae?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NzR8fHBlcnJvfGVufDB8fDB8fHww", "3456"));
        mapaMascotas.put(15L, new Mascota(15L, "Zoe", "Perro", 4, 9.7, "Obesidad", "https://images.unsplash.com/photo-1588269845464-8993565cac3a?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8ODB8fHBlcnJvfGVufDB8fDB8fHww", "7890"));

        System.out.println("Mascotas cargadas: " + mapaMascotas.size());
    }

    // Obtener todas las mascotas sin utilizar listas
    public Collection<Mascota> obtenerTodas() {
        return mapaMascotas.values();
    }

    // Obtener una mascota por su nombre utilizando únicamente el mapa
    public Mascota obtenerPorNombre(String nombre) {
        return mapaMascotas.values()
                           .stream()
                           .filter(m -> m.getNombre().equalsIgnoreCase(nombre))
                           .findFirst()
                           .orElse(null);
    }

    public void eliminar(Long id) {
        mapaMascotas.remove(id);
    }
    public void modificar (Mascota mascota) {
        mapaMascotas.put(mascota.getId(), mascota);
    }

    public void agregar(Mascota mascota) {
        mapaMascotas.put(mascota.getId(), mascota);
    }
    public Mascota obtenerPorId(Long id) {
        System.out.println("Buscando mascota con ID: " + id);
        Mascota mascota = mapaMascotas.get(id);
        if (mascota == null) {
            System.out.println("Mascota no encontrada!");
        } else {
            System.out.println("Mascota encontrada: " + mascota.getNombre());
        }
        return mascota;
    }
    
}
