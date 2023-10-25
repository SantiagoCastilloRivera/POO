
package pkginterface;


public abstract class Trapecio implements Forma {
    private double baseMa;
    private double baseMe;
    private double altura;
    private double lado1;
    private double lado2;

    public Trapecio(double altura) {
        this.altura = 0;
        this.lado1 = (baseMa - baseMe)/2;
        this.lado2 = Math.sqrt((lado1 * lado1)+(altura * altura));
        this.baseMa =  0;
        this.baseMe = 0;   
    }

    public Trapecio(int baseMa, int baseMe) {
        this.baseMa = baseMa;
        this.baseMe = baseMe;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    
    
        @Override
    public double calcularArea() {
        return (baseMa + baseMe)* altura / 2;
    }

    @Override
    public double calcularPerimetro() {
        return baseMa + baseMe + (lado2 * 2);
    }
    
}
