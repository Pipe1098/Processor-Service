package com.example.taller.procesador.archivo.Model;

public class File {
    
    private String ruta;
    private String tipo;

    public File(String ruta, String tipo) {
        this.ruta = ruta;
        this.tipo = tipo;
    }

    public String getRuta(){
        return this.ruta;
    }

    public String getTipo() {
        return tipo;
    }
}
