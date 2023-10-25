package pkginterface;

// Implementación para un cuadrado
public class Cuadrado implements Forma {
    private double lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}
