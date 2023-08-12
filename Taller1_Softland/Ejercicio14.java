// Escribe un programa que solicite al usuario un número
//     entero positivo y verifique si es un número perfecto.
//     Un número perfecto es aquel cuya suma de sus divisores propios
//     (excluyendo al propio número) es igual al número.

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner numero_entero = new Scanner(System.in);
        System.out.print("Digita un número entero positivo: ");
        int num = numero_entero.nextInt();
        int suma = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        System.out.println(" ------- A CONTINUACION LAS RESPUESTAS ------- ");

        System.out.println(suma == num ? num + " es un número perfecto." : num + " no es un número perfecto.");
    }
}
