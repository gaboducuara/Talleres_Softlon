package Clases;

import IProducto.IProducto;

public class ClaseRopa extends Categoria implements IProducto {

    public ClaseRopa() {
        super("Ropa");
    }

    public ClaseRopa(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularPrecio() {
        return 500;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Todo un outfit de libardino");
    }
}
