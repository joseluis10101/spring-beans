package com.tecsup.spring.model;

import java.util.List;

public class Musico {

    private String nombre;
    
    private int canciones;
    
    private Instrumento instrumento;
    
    private List<Instrumento> instrumentos;

    public Musico() {
    }
    
    public Musico(int canciones) {
        this.canciones = canciones;
    }

    public Musico(Instrumento instrumento) {
        this.instrumento = instrumento;
    }
   
    public Musico(int canciones, Instrumento instrumento) {
        this.canciones = canciones;
        this.instrumento = instrumento;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCanciones() {
        return canciones;
    }

    public void setCanciones(int canciones) {
        this.canciones = canciones;
    }

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }

    public List<Instrumento> getInstrumentos() {
        return instrumentos;
    }

    public void setInstrumentos(List<Instrumento> instrumentos) {
        this.instrumentos = instrumentos;
    }

    
    
    
    
}
