package com.proyecto.buckys_vet.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {

    @GetMapping("/error404")
    public String mostrarError404() {
        return "error404"; 
    }
}
