package Clases;

public class Pajaro extends abstractAnimal{

    public Pajaro() {
        super("La lora");
    }

    public void  hacerSonido() {
        System.out.println(nombre + " " + "El pajaro hace PIO PIO");
    }

}
