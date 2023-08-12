
//Realiza un programa que simule un juego de adivinar un número.
  //      El programa debe generar un número aleatorio entre 1 y 100, y el usuario debe adivinarlo.
    //    El programa debe indicar si el número ingresado es mayor o menor que el número a adivinar.

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int numeroAdivinar = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);
        int intentos;
        int Intentoscontador = 0;
        do {
            System.out.print("Adivina el número entre 1 y 100: ");
            intentos = scanner.nextInt();
            Intentoscontador++;

            System.out.println(intentos > numeroAdivinar ? "El número es menor." : intentos < numeroAdivinar ? "El número es mayor.": "");

        } while (intentos != numeroAdivinar);
        System.out.println(" ------- A CONTINUACION LA RESPUESTA ------- ");
        System.out.println("genial el numero es:" + " " + numeroAdivinar);
        System.out.println("Has adivinado el número en " + Intentoscontador + " intentos.");
    }
}
