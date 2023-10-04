public class Main {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[10];

        empleados[0] = new EmpleadoAsalariado("Empleado 1", 2500, 300);
        empleados[1] = new EmpleadoAsalariado("Empleado 2", 3000, 400);
        empleados[2] = new EmpleadoPorHoras("Empleado 3", 40, 15);

        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoPorHoras) {
                System.out.println(empleado.getNombre() + ": " + empleado.calcularSalario());
            }
        }

        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoAsalariado) {
                System.out.println(empleado.getNombre() + ": " + empleado.calcularSalario());
            }
        }

        empleados[0].setNombre("Nuevo Nombre");
        empleados[0].setSalarioBase(2800);

        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoPorHoras) {
                System.out.println(empleado.getNombre() + ": " + empleado.calcularSalario());
            }
        }

        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equals("Empleado 3")) {
                System.out.println("Empleado encontrado: " + empleado.getNombre());
                break;
            }
        }
    }
}