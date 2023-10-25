package pkginterface;

public class Interface {

    public static void main(String[] args) {
  
        // Crear instancias de las formas
        Cuadrado miCuadrado = new Cuadrado(5);
        Circulo miCirculo = new Circulo(3);
        Triangulo miTriangulo = new Triangulo(3,4) {};
        Trapecio miTrapecio = new Trapecio (4,45) {};

        // Calcular y mostrar áreas y perímetros
        System.out.println("Área del cuadrado: " + miCuadrado.calcularArea());
        System.out.println("Perímetro del cuadrado: " + miCuadrado.calcularPerimetro());

        System.out.println("Área del círculo: " + miCirculo.calcularArea());
        System.out.println("Perímetro del círculo: " + miCirculo.calcularPerimetro());
        
        System.out.println("Área del triangulo: " + miTriangulo.calcularArea());
        System.out.println("Perímetro del Triangulo: " + miTriangulo.calcularPerimetro());
        
        System.out.println("Área del Trapecio: " + miTrapecio.calcularArea());
        System.out.println("Perímetro del Trapecio: " + miTrapecio.calcularPerimetro());
    }
    
}
