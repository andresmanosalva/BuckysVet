package com.proyecto.buckys_vet.entidad;

public class Mascota {
    private Long id;
    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private String enfermedad;
    private String imagenUrl;
    private String duenoCedula;

    public Mascota() {
        // Default constructor
    }

    public  Mascota(Long id, String nombre, String especie, int edad, double peso, String enfermedad, String imagenUrl, String duenoCedula) {
            this.id = id;
            this.nombre = nombre;
            this.especie = especie;
            this.edad = edad;
            this.peso = peso;
            this.enfermedad = enfermedad;
            this.imagenUrl = imagenUrl;
            this.duenoCedula = duenoCedula;
    }

    public Long getId() { 
        return id; 
    }

    public void setId(Long id) {
        this.id = id; 
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

    public String getDuenoCedula() { 
        return duenoCedula; 
    }

    public void setDuenoCedula(String duenoCedula) { 
        this.duenoCedula = duenoCedula; 
    }

}
