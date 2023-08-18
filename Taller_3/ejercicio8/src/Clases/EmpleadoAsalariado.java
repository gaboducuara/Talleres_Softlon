package Clases;

public class EmpleadoAsalariado extends abstractEmpleado{
    private double salarioMensual;
    public EmpleadoAsalariado(String nombre, double salarioMensual) {
        super(nombre);
        this.salarioMensual = salarioMensual;
    }
    @Override
    public double calcularSalario() {
        return salarioMensual;
    }
}
