package com.proyecto.buckys_vet.repositorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.proyecto.buckys_vet.entidad.Mascota;

@Repository
public class MascotaRepositorio {

    private List<Mascota> listaMascotas = new ArrayList<>();

    public MascotaRepositorio() {
        listaMascotas.add(new Mascota(1L, "Bucky", "Perro", 4, 15.2, "Ninguna", "https://plus.unsplash.com/premium_photo-1694819488591-a43907d1c5cc?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8cGVycm98ZW58MHx8MHx8fDA%3D"));
        listaMascotas.add(new Mascota(2L, "Luna", "Gato", 2, 5.3, "Alergia alimentaria", "https://plus.unsplash.com/premium_photo-1673967831980-1d377baaded2?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8Z2F0b3N8ZW58MHx8MHx8fDA%3D"));
        listaMascotas.add(new Mascota(3L, "Simba", "Gato", 3, 7.8, "Ninguna", "https://images.unsplash.com/photo-1536589961747-e239b2abbec2?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Nnx8Z2F0b3N8ZW58MHx8MHx8fDA%3D"));
        listaMascotas.add(new Mascota(4L, "Coco", "Perro", 1, 8.5, "Parvovirus", "https://images.unsplash.com/photo-1517849845537-4d257902454a?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8N3x8cGVycm98ZW58MHx8MHx8fDA%3D"));
        listaMascotas.add(new Mascota(5L, "Rocky", "Perro", 5, 20.3, "Displasia de cadera", "https://images.unsplash.com/photo-1583511655826-05700d52f4d9?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NDZ8fHBlcnJvfGVufDB8fDB8fHww"));
        listaMascotas.add(new Mascota(6L, "Bella", "Gato", 4, 6.1, "Ninguna", "https://images.unsplash.com/photo-1582725461742-8ecd962c260d?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzF8fGdhdG9zfGVufDB8fDB8fHww"));
        listaMascotas.add(new Mascota(7L, "Max", "Perro", 7, 12.4, "Artrosis", "https://images.unsplash.com/photo-1575859431774-2e57ed632664?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NDh8fHBlcnJvfGVufDB8fDB8fHww"));
        listaMascotas.add(new Mascota(8L, "Milo", "Gato", 1, 4.5, "Ninguna", "https://images.unsplash.com/flagged/photo-1557427161-4701a0fa2f42?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzB8fGdhdG9zfGVufDB8fDB8fHww"));
        listaMascotas.add(new Mascota(9L, "Toby", "Perro", 2, 10.0, "Infección en el oído", "https://images.unsplash.com/photo-1596492784531-6e6eb5ea9993?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mjh8fHBlcnJvfGVufDB8fDB8fHww"));
        listaMascotas.add(new Mascota(10L, "Rex", "Perro", 6, 25.1, "Ninguna", "https://images.unsplash.com/photo-1491604612772-6853927639ef?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzJ8fHBlcnJvfGVufDB8fDB8fHww"));
        listaMascotas.add(new Mascota(11L, "Maggie", "Perro", 8, 18.7, "Cataratas", "https://images.unsplash.com/photo-1591946559594-8c6d3b7391eb?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NTh8fHBlcnJvfGVufDB8fDB8fHww"));
        listaMascotas.add(new Mascota(12L, "Charlie", "Gato", 5, 6.0, "Insuficiencia renal", "https://images.unsplash.com/photo-1606509769472-7660d4a478ac?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NTR8fGdhdG9zfGVufDB8fDB8fHww"));
        listaMascotas.add(new Mascota(13L, "Sasha", "Gato", 3, 5.8, "Ninguna", "https://images.unsplash.com/photo-1530305016043-f725a9268648?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NjN8fGdhdG9zfGVufDB8fDB8fHww"));
        listaMascotas.add(new Mascota(14L, "Duke", "Perro", 2, 13.0, "Dermatitis", "https://images.unsplash.com/photo-1546491764-67a5b8d5b3ae?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NzR8fHBlcnJvfGVufDB8fDB8fHww"));
        listaMascotas.add(new Mascota(15L, "Zoe", "Perro", 4, 9.7, "Obesidad", "https://images.unsplash.com/photo-1588269845464-8993565cac3a?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8ODB8fHBlcnJvfGVufDB8fDB8fHww"));

        System.out.println("Mascotas cargadas: " + listaMascotas.size());
    }

    // Obtener todas las mascotas
    public List<Mascota> obtenerTodas() {
        return listaMascotas;
    }

    public Mascota obtenerPorNombre(String nombre) {
        return listaMascotas.stream()
                             .filter(m -> m.getNombre().equalsIgnoreCase(nombre))
                             .findFirst()
                             .orElse(null);  // Si no se encuentra, retorna null
    }
}
