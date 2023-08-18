import Clases.ClaseElectronica;
import Clases.ClaseLibro;
import Clases.ClaseRopa;

public class Main {
    public static void main(String[] args) {
        ClaseElectronica claseElectronica = new ClaseElectronica();
        ClaseLibro claseLibro = new ClaseLibro();
        ClaseRopa claseRopa  = new ClaseRopa();

        claseElectronica.calcularPrecio();
        claseLibro.mostrarDetalles();
        claseRopa.mostrarDetalles();

    }
}