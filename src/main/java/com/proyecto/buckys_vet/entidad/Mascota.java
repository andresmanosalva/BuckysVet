package com.proyecto.buckys_vet.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private String enfermedad;
    private String imagenUrl;
    @Id
    @GeneratedValue
    private Long mascotaId;
    @ManyToOne 
    @JoinColumn(name = "dueno_id")
    private Dueno dueno;
    

    public Mascota() {
        // Default constructor
    }

    public long getMascotaId() {
        return mascotaId;
    }



    public Mascota(String nombre, String especie, int edad, double peso, String enfermedad, String imagenUrl,
            String duenoCedula) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.enfermedad = enfermedad;
        this.imagenUrl = imagenUrl;
    }

    public Mascota(Long mascotaId, String nombre, String especie, int edad, double peso, String enfermedad,
            String imagenUrl, Dueno dueno) {
        this.mascotaId = mascotaId;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.enfermedad = enfermedad;
        this.imagenUrl = imagenUrl;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    public void setMascotaId(Long mascotaId) {
        this.mascotaId = mascotaId;
    }

    public Dueno getDueno() {
return dueno;
    }
 
    public void setDueno(Dueno dueno) {
this.dueno = dueno;
    }
}

   
