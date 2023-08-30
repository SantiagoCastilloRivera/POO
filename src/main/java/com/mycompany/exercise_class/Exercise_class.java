
package com.mycompany.exercise_class;
import call.unicauca.edu.co.ex_atrr;


public class Exercise_class {

    public static void main(String[] args) {
      ex_atrr atrr = new ex_atrr();
      
        System.out.println("");
        System.out.println("Import name I1:" + atrr.nombre);
        atrr.nombre = "Santiago";
        System.out.println("Import name I2:" + atrr.nombre);
        System.out.println("Import year:" + atrr.year_hbd);
    }
}
