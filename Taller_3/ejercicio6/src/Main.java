import Clases.Gato;
import Clases.Pajaro;
import Clases.Perro;
import Clases.abstractAnimal;

public class Main {
    public static void main(String[] args) {
        abstractAnimal[] animales = new abstractAnimal[3];
        animales[0] = new Perro();
        animales[1] = new Gato();
        animales[2] = new Pajaro();

        for (abstractAnimal animal : animales) {
            animal.hacerSonido();
        }
    }
}