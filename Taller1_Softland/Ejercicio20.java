
//Realiza un programa que solicite
//al usuario una cadena y luego invierta su orden

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una oracion (String): ");
        String cadena = sc.nextLine();
        sc.close();

        String oracion_invertida = new StringBuilder(cadena).reverse().toString();

        System.out.println(" ------- A CONTINUACION LA RESPUESTA ------- ");
        System.out.println("oracion invertida (Strings): " + oracion_invertida);
    }
}
