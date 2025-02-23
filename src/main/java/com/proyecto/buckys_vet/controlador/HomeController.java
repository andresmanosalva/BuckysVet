package com.proyecto.buckys_vet.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class HomeController {
    @GetMapping("/{pagina}")
    public String home(@PathVariable String pagina) {
        return "html/" + pagina;
    }
    
}
