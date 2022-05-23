package com.example.Ejercicio6;

public class Greeting {

    private int id=0;
    private String contenido=null;

    public Greeting(){}
    public Greeting(int id, String contenido) {
        this.id = id;
        this.contenido = contenido;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getId() {
        return id;
    }

    public String getContenido() {
        return contenido;
    }

    @Override
    public String toString() {
        return "id=" + id +", contenido=" + contenido;
    }
}
