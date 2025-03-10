package com.proyecto.buckys_vet.controlador;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.proyecto.buckys_vet.entidad.Dueno;
import com.proyecto.buckys_vet.servicio.DuenoServicio;
import com.proyecto.buckys_vet.servicio.AutenticacionServicio;

@Controller
public class LoginController {
    @Autowired
    private AutenticacionServicio autenticacionServicio;
    
    @Autowired
    private DuenoServicio duenoServicio;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
    
    @PostMapping("/login")
    public String login(@RequestParam String cedula, Model model) {
        Dueno dueno = duenoServicio.obtenerPorCedula(cedula);

        if (dueno != null) {
            return "redirect:/mascotas/" + cedula; // Redirige a la vista con sus mascotas
        } else {
            model.addAttribute("error", "Cédula incorrecta o usuario no encontrado.");
            return "login";
        }
    }
}

