package com.proyecto.buckys_vet.controlador;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.proyecto.buckys_vet.entidad.RecursoNoEncontradoException;

@ControllerAdvice
public class CustomErrorController implements ErrorController {

    @ExceptionHandler(RecursoNoEncontradoException.class)
    public String manejarRecursoNoEncontrado(RecursoNoEncontradoException ex, Model model) {
        model.addAttribute("mensaje", ex.getMessage());
        return "Error404"; // Nombre de la vista de error
    }
}
