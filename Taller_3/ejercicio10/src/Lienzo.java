import Interfaz.Dibujable;

public class Lienzo implements Dibujable {
    private final Dibujable[] dibujables;

    @Override
    public void dibujar() {

    }

    public Lienzo (Dibujable[] dibujables) {
        this.dibujables = dibujables;
    }

    public void dibujarTodos() {
        for (Dibujable dibujable : dibujables) {
            dibujable.dibujar();
        }
    }

   
}
