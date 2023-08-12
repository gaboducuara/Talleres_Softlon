import java.util.Scanner;

//Realiza un programa que solicite al usuario una cadena y reemplace todas las apariciones de una letra específica por otra
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita una cadena: ");
        String oracion = scanner.nextLine();
        System.out.println("Digita la letra que quieres reemplazar: ");
        char letra_antigua = scanner.next().charAt(0);
        System.out.println("Digita la nueva letra: ");
        char letra_nueva = scanner.next().charAt(0);
        scanner.close();

        String Oracion_Nueva = oracion.replace(letra_antigua, letra_nueva);


        System.out.println(" ------- A CONTINUACION LA RESPUESTA ------- ");
        System.out.println("Oracion original: " + oracion);
        System.out.println("Oracion nueva: " + Oracion_Nueva);
    }
}
