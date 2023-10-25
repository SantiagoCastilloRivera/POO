
package pkginterface;

public abstract class Triangulo implements Forma {
private double base;
private double altura;
private  double hipotenusa;

public Triangulo(){
    this.base = 0;
    this.altura = 0;
    this.hipotenusa= 0;
}

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.hipotenusa = hipotenusa;
    }
    
@Override
     public double calcularHipotenusa(){
         return Math.sqrt(base*base+altura*altura);
     }
    
    @Override
    public double calcularArea() {
        return (base * altura)/2;
    }

    @Override
    public double calcularPerimetro() {
        return base+ altura + calcularHipotenusa(); 
    }
}
