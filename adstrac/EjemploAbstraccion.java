
package com.mycompany.adstrac;
public class EjemploAbstraccion {

    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        double area = circulo.calcularArea();
        System.out.println("Area del circulo: "+area);

    }
}
