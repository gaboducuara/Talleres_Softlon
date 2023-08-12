
//Crea un programa que solicite al usuario una frase
//y luego muestre las palabras ordenadas alfabéticamente

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita una oracion: ");
        String oracion = scanner.nextLine();
        scanner.close();

        String[] palabras = oracion.split("\\s+");
        Arrays.sort(palabras);

        System.out.println(" ------- A CONTINUACION LA RESPUESTA ------- ");
        System.out.println("Palabras ordenadas alfabéticamente: ");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
