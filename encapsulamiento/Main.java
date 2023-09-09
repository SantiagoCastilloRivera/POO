
package com.mycompany.encapsulamiento;

public class Main {
    public static void main(String[] args) {
      Persona persona = new Persona("Santiago", 18);
      
        System.out.println("Nombre" + persona.getNombre());
        System.out.println("Edad:" + persona.getEdad());
        
        persona.setEdad(22);
        System.out.println("Nueva Edad:" + persona.getEdad());
        
        persona.setEdad(-5);
    }
}
