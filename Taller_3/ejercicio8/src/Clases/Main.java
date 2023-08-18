package Clases;

import Clases.EmpleadoAsalariado;

public class Main {
    public static void main(String[] args) {
        abstractEmpleado[] empleados = new abstractEmpleado[3];
        empleados[0] = new EmpleadoAsalariado("Juan", 2500.0);
        empleados[1] = new EmpleadoPorHora("María", 12.5, 40);
        empleados[2] = new EmpleadoPorHora("Carlos", 15.0, 30);

        for (abstractEmpleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Salario: " + empleado.calcularSalario());
            System.out.println("=========================");
        }
    }
}
