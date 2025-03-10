package com.proyecto.buckys_vet.entidad;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Dueno {
    private String cedula;
    private String nombre;
    private String correo;
    private String celular;
    private String imagenUrl;
  @Id
  @GeneratedValue
  private Long id;

  @OneToMany(mappedBy = "dueno") 
  private List<Mascota> mascotas = new ArrayList<>();

    public Dueno(String cedula, String nombre, String correo, String celular, String imagenUrl) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
        this.imagenUrl = imagenUrl;
    }

    public Dueno(Long id, String cedula, String nombre, String correo, String celular, String imagenUrl) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
        this.imagenUrl = imagenUrl;
    }

    public Long getId() {
        return id;
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

    public List<Mascota> getMascotas() {
        return mascotas;
            }
         
            public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
            }

}


