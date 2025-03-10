package com.proyecto.buckys_vet.entidad;

import java.util.Map;

public class Dueno {
    private String cedula;
    private String nombre;
    private String correo;
    private String celular;
    private String imagenUrl;
    private Map<Long, Mascota> mascotas;
    

    public Dueno(String cedula, String nombre, String correo, String celular, String imagenUrl) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
        this.imagenUrl = imagenUrl;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getImagenUrl() { 
        return imagenUrl; 
    }

    public void setImagenUrl(String imagenUrl) { 
        this.imagenUrl = imagenUrl; 
    }

}


