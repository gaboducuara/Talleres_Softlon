import Interfaz.Dibujable;

public class Main {
    public static void main(String[] args) {
        Dibujable[] dibujables = new Dibujable[3];
        dibujables[0] = new Circulo();
        dibujables[1] = new Rectangulo();
        dibujables[2] = new Cuadrado();

        Lienzo lienzo = new Lienzo(dibujables);
        lienzo.dibujarTodos();
    }
}