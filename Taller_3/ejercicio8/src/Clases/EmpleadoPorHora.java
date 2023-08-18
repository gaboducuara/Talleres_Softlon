package Clases;

public class EmpleadoPorHora extends abstractEmpleado{

    private double tarifaPorHora;
    private int horasTrabajadas;

    public EmpleadoPorHora(String nombre, double tarifaPorHora, int horasTrabajadas) {
        super(nombre);
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return tarifaPorHora * horasTrabajadas;
    }
}
