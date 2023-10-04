public class EmpleadoPorHoras extends Empleado {
    private final int horasTrabajadas;
    private final double tarifaPorHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, 0); // El salario base no se utiliza para calcular el salario por horas.
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaPorHora;
    }
}
