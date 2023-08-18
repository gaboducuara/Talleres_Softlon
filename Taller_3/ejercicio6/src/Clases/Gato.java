package Clases;

public class Gato extends abstractAnimal{
    public Gato() {
        super("Lucas");
    }

    public void hacerSonido() {
        System.out.println( nombre + " " + "El gato hace miauuuuuu");
    }

}
