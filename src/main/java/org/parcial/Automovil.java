/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.parcial;

/**
 *
 * @author iikan
 */
public class Automovil extends Vehiculo{
      private int numeroPuertas;
      private int horaEntrada, horaSalida;

    // Constructores, getters y setters

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    // Otros métodos específicos para automóviles
    
    public Automovil(int numeroPuertas, String marca, String modelo, String placa, int horaEntrada) {
        super(marca, modelo, placa, horaEntrada);
        this.numeroPuertas = numeroPuertas;
    }
    
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    
  
}
