import java.util.Scanner;

/*
Crea un programa que calcule y muestre el área y el perímetro de un círculo.
El usuario debe proporcionar el radio del círculo.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner circulo = new Scanner(System.in);
        System.out.print("Digita el radio del círculo: ");
        double radio = circulo.nextDouble();
        System.out.println(" ------- A CONTINUACION LAS RESPUESTAS ------- ");
        System.out.println("El área del círculo es: " + (Math.PI * Math.pow(radio, 2)));
        System.out.println("Y el perímetro del círculo es: " + (2 * Math.PI * radio));
    }
}
