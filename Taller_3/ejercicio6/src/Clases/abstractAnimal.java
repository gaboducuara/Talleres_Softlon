package Clases;

public abstract class abstractAnimal {
    protected String nombre;

    public abstractAnimal(String nombre) {
        this.nombre = nombre;
    }
    public abstract void hacerSonido();
}
