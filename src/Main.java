package com.mycompany.sistemagestion;
public class Main {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[10];
        
        empleados[0] = new EmpleadoAsalariado("Empleado 1", 3000, 500);
        empleados[1] = new EmpleadoPorHoras("Empleado 2", 40, 15);
        empleados[2] = new EmpleadoPorHoras("Empleado 3", 35, 12);
        empleados[3] = new EmpleadoAsalariado("Empleado 4", 3200, 600);
        empleados[4] = new EmpleadoAsalariado("Empleado 5", 2800, 400);
        empleados[5] = new EmpleadoPorHoras("Empleado 6", 38, 18);
        empleados[6] = new EmpleadoPorHoras("Empleado 7", 42, 20);
        empleados[7] = new EmpleadoAsalariado("Empleado 8", 3100, 550);
        empleados[8] = new EmpleadoAsalariado("Empleado 9", 2900, 450);
        empleados[9] = new EmpleadoPorHoras("Empleado 10", 37, 17);

        System.out.println("Empleados por horas:");
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoPorHoras) {
                System.out.println(empleado.getNombre() + ": " + empleado.calcularSalario());
            }
        }
        
        System.out.println("\nEmpleados asalariados:");
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoAsalariado) {
                System.out.println(empleado.getNombre() + ": " + empleado.calcularSalario());
            }
        }

        if (empleados[1] != null) {
            empleados[1].setNombre("Nuevo Nombre Empleado ");
            empleados[1].setSalarioBase(3200);
        }

        System.out.println("\nEmpleados por horas después de la modificación:");
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoPorHoras) {
                System.out.println(empleado.getNombre() + ": " + empleado.calcularSalario());
            }
        }

        if (empleados[1] != null) {
            System.out.println("\nEmpleado específico (Empleado 2): " + empleados[1].getNombre());
        }
    }
}
