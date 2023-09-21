package com.gamis214;

public class Canguro extends Animal {

    private String especie;

    public Canguro(String nombre, String tipo_alimentacion, int edad, String especie) {
        super(nombre, tipo_alimentacion, edad);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void mostrar() {
        System.out.println(getNombre() + "-" + getTipo_alimentacion() + "-" + getEdad() + "-" + getEspecie());
    }

    @Override
    public void Alimentarse() {
        System.out.println("Me alimento de hierbas y plantas");
    }
}
