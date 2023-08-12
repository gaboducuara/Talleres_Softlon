import java.util.Scanner;

//Pide al usuario una frase y muestra cada palabra por separado
public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita una oracion: ");
        String oracion = scanner.nextLine();
        scanner.close();

        String[] palabras = oracion.split("\\s+");

        System.out.println(" ------- A CONTINUACION LA RESPUESTA ------- ");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
