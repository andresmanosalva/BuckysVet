package com.proyecto.buckys_vet.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto.buckys_vet.entidad.Mascota;
import com.proyecto.buckys_vet.servicio.MascotaServicio;

@Controller
@RequestMapping
public class MascotaController {

    @Autowired
    private MascotaServicio mascotaServicio;

    // Método para manejar la solicitud GET para listar las mascotas
    @GetMapping("/mascotas")
    public String listarMascotas(Model model) {
        // Obtener las mascotas desde el servicio
        model.addAttribute("mascotas", mascotaServicio.obtenerTodas());
        return "infoMascotas";  // Vista que se mostrará
    }

    @GetMapping("/infoMascota/{nombre}")
    public String verMascota(@PathVariable String nombre, Model model) {
        // Obtener la mascota por nombre
        Mascota mascota = mascotaServicio.obtenerPorNombre(nombre);

        // Verificar si la mascota existe
        if (mascota != null) {
            model.addAttribute("mascota", mascota);
            return "detallesMascota"; // Nombre del archivo HTML (Thymeleaf)
        } else {
            return "error"; // Página de error si la mascota no se encuentra
        }
    }
}
