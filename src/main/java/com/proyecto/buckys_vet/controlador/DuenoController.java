package com.proyecto.buckys_vet.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto.buckys_vet.entidad.Dueno;
import com.proyecto.buckys_vet.servicio.DuenoServicio;

@Controller
@RequestMapping
public class DuenoController {

    @Autowired
    private DuenoServicio duenoServicio;

    // Método para listar todos los dueños
    @GetMapping("/duenos")
    public String listarDuenos(Model model) {
        model.addAttribute("duenos", duenoServicio.obtenerTodos());
        return "infoDuenos"; // Vista infoDuenos.html
    }

    // Método para mostrar la información de un dueño por cédula
    @GetMapping("/infoDuenos/{cedula}")
    public String verDueno(@PathVariable String cedula, Model model) {
        Dueno dueno = duenoServicio.obtenerPorCedula(cedula);
        if (dueno != null) {
            model.addAttribute("dueno", dueno);
            return "detallesDueno"; // Vista detallesDueno.html
        } else {
            return "error"; // Página de error si no se encuentra el dueño
        }
    }

    // Método para mostrar el formulario de creación de un dueño
    @GetMapping("/crearDueno")
    public String crearDueno(Model model) {
        Dueno dueno;
        dueno = new Dueno("", "", "", "","");
        model.addAttribute("dueno", dueno);
        return "crearDueno"; // Vista crearDueno.html
    }

    // Método POST para agregar un nuevo dueño
    @PostMapping("/agregarDueno")
    public String agregarDueno(@ModelAttribute("dueno") Dueno dueno) {
        duenoServicio.guardar(dueno);
        return "redirect:/infoDuenos/" + dueno.getCedula();
    }

    // Método para eliminar un dueño por cédula
    @GetMapping("/eliminardueno/{cedula}")
    public String eliminarDueno(@PathVariable String cedula) {
        duenoServicio.eliminar(cedula);
        return "redirect:/duenos";
    }

    @GetMapping("/modificardueno/{cedula}")
    public String modificarDueno(@PathVariable ("cedula") String cedula, Model model) {
        model.addAttribute("dueno", duenoServicio.obtenerPorCedula(cedula));
        return "modificardueno";
    }

    @PostMapping("/modificardueno/{cedula}")
    public String updateDueno(@PathVariable("cedula") String cedula, @ModelAttribute("dueno") Dueno dueno) {
        duenoServicio.update(dueno);
        return "redirect:/duendos";
    }
}
