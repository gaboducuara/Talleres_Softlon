package Clases;

public abstract class abstractEmpleado {
    private String nombre;

    public abstractEmpleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double calcularSalario();

}
