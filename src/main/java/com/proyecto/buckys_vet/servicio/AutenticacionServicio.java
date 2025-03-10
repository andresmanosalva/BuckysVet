package com.proyecto.buckys_vet.servicio;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class AutenticacionServicio {
    
    private final Map<String, String> usuarios = Map.of(
        "juan", "1234",
        "maria", "5678"
    );

    public boolean autenticar(String username, String password) {
        return usuarios.containsKey(username) && usuarios.get(username).equals(password);
    }
    
}
