package com.proyecto.buckys_vet.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Map;
import com.proyecto.buckys_vet.entidad.Dueno;
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
        return "infoMascotas"; // Vista que se mostrará
    }

    /*@GetMapping("/infoMascota/{nombre}")
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
    }*/

    @GetMapping("/infoMascota/{id}")
    public String verMascota(@PathVariable Long id, Model model) {
        System.out.println("Llamando a obtenerPorId con ID: " + id);
        Mascota mascota = mascotaServicio.obtenerPorId(id);
        if (mascota != null) {
            model.addAttribute("mascota", mascota);
            return "detallesMascota"; // Nombre de la plantilla Thymeleaf
        } else {
            return "Error404"; // Si no se encuentra la mascota
        }
    }


    @GetMapping("/crearmascota")
    public String crearMascota(Model model, Dueno dueno) {
        Mascota mascota = new Mascota(0L, "", "", 0, 0.0, "", "", dueno.getCedula());
        model.addAttribute("mascota", mascota);
        return "crearMascota";
    }

    @PostMapping("/agregar")
    public String agregarMascota(@ModelAttribute("mascota") Mascota mascota) {
        mascotaServicio.guardar(mascota);
        return "redirect:/infoMascota/" + mascota.getId();
    }

    @GetMapping("/eliminarmascota/{id}")
    public String eliminarMascota(@PathVariable Long id) {
        mascotaServicio.eliminar(id);
        return "redirect:/mascotas";
    }

    @GetMapping("/modificarmascota/{id}")
    public String modificarMascota(@PathVariable ("id") Long id, Model model) {
        model.addAttribute("mascota", mascotaServicio.obtenerPorId(id));
        return "modificarMascota";
    }

    @PostMapping("modificarmascota/{id}")
    public String updateMascota(@PathVariable("id") Long id, @ModelAttribute("mascota") Mascota mascota) {
        Mascota mascotaExistente = mascotaServicio.obtenerPorId(mascota.getId());
    
    // Mantener valores que no se deben perder (si hay algún dato que no se edita en el formulario)
        mascota.setDuenoCedula(mascotaExistente.getDuenoCedula());

    // Actualizar la mascota
        mascotaServicio.update(mascota);
    
        return "redirect:/mascotas";
    }

    @GetMapping("/mascotas/{cedula}")
public String listarMascotasPorDueno(@PathVariable String cedula, Model model) {
    // Obtener las mascotas en un Map
    Map<String, Mascota> mascotas = mascotaServicio.obtenerPorDueno(cedula);

    model.addAttribute("mascotas", mascotas);
    model.addAttribute("cedulaDueno", cedula);

    return "infoMascotas"; // Vista donde se mostrarán solo sus mascotas
}

    
}
