
//Realiza un programa que pida al usuario un número entero y determine si es un número primo o no

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digita un número entero: ");
        int numero = scanner.nextInt();
        boolean Numero_primo = true;
        System.out.println();

        if (numero <= 1) {
            Numero_primo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    Numero_primo = false;
                    break;
                }
            }
        }

        System.out.println(Numero_primo ? "El número " + numero + " es primo." : "El número " + numero + " no es primo.");
    }
}

