package com.tecsup.spring.model;

public class Instrumento {

    private String nombre;
    private String marca;

    public void sonido() {
        System.out.println("Sonido de Instrumento");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    

}
