import java.util.Scanner;

//Escribe un programa que solicite al usuario su nombre y luego
// lo imprima en mayúsculas y minúsculas
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digita tu nombre: ");
        String nombre = scanner.nextLine();
        scanner.close();

        String nombre_Mayusculas = nombre.toUpperCase();
        String nombre_Minusculas = nombre.toLowerCase();

        System.out.println(" ------- A CONTINUACION LA RESPUESTA ------- ");

        System.out.println("Nombre en mayúsculas: " + nombre_Mayusculas);
        System.out.println("Nombre en minúsculas: " + nombre_Minusculas);
    }
}
