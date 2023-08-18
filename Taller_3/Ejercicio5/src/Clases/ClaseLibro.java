package Clases;

import IProducto.IProducto;

public class ClaseLibro extends Categoria implements IProducto {

    public ClaseLibro() {
        super("LIBRO");
    }

    public ClaseLibro(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularPrecio() {
        return 50;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("libro de gabriel garcia marquez");
    }
}
