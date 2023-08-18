package Clases;

import IProducto.IProducto;

public class ClaseElectronica extends Categoria implements IProducto{

    public ClaseElectronica() {
        super("Electronica");
    }

    public ClaseElectronica(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularPrecio() {
        return 500;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Computadora");
    }
}
