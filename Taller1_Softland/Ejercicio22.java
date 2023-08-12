
//Escribe un programa que solicite al usuario una frase
//y verifique si es un palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda)

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita una frase: ");
        String frase = scanner.nextLine();
        scanner.close();

        String frase_Normal = frase.replaceAll("\\s+", "").toLowerCase();
        String fraseInvertida = new StringBuilder(frase_Normal).reverse().toString();

        System.out.println(" ------- A CONTINUACION LA RESPUESTA ------- ");
        System.out.println(frase_Normal.equals(fraseInvertida) ? "La frase es un palíndromo." : "La frase no es un palíndromo.");

    }
}
