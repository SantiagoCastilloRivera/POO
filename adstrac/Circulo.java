
package com.mycompany.adstrac;


class Circulo extends formaGeometrica {
    private final double radio;
    public Circulo(double radio){
        this.radio = radio;
    }
    
 
    @Override
    public double calcularArea(){
        return Math.PI * radio * radio;
    }
}
