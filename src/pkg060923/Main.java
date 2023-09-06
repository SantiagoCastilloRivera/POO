
package pkg060923;
import exersice.Persona;
public class Main {

    public static void main(String[] args) {
        Persona[] arrayPerson = new Persona [3];
        //Persona person = new Persona ("Santiago","Rivera","1088156408");
        arrayPerson[0] = new Persona("Santiago","Rivera","1088156408");
        arrayPerson[1] = new Persona("Carlos","montero","1088146509");
        arrayPerson[2] = new Persona("Andres","solarte","1088156402");
     
         for(Persona persona : arrayPerson){
         System.out.println(persona.getFirstName());
         System.out.println(persona.getLastName());
         System.out.println(persona.getDocument());
         
     }  
        
    }  
}
