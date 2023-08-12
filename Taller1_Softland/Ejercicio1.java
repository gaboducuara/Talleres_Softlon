import java.util.Scanner;

//Realiza un programa que solicite al usuario dos números enteros
  //      y muestre su suma, resta, multiplicación y división.
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        System.out.println("digite el primer número entero: ");
        int num1 = numeros.nextInt();
        System.out.println("digita el segundo número entero: ");
        int num2 = numeros.nextInt();
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = (double)num1 / num2;

        System.out.println(" ------- A CONTINUACION LAS RESPUESTAS ------- ");
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: " + division);
    }
}
