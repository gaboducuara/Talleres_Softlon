import java.util.Scanner;

//Escribe un programa que solicite al
        //usuario un número entero positivo y calcule su factorial.
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digita un número entero positivo: ");
        int numero = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= numero; i++) { factorial *= i; }
        System.out.println(" ------- A CONTINUACION LA RESPUESTA ------- ");
        System.out.println("El factorial de " + numero + " es " + factorial);
    }
}
