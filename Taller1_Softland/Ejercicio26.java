import java.util.Scanner;

//Escribe un programa que pida al usuario una
//cadena y muestre cuántos caracteres tiene sin contar los espacios en blanco
public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita una oracion: ");
        String oracion = scanner.nextLine();
        scanner.close();

        int numero_Caracteres = oracion.replaceAll("\\s+", "").length();

        System.out.println(" ------- A CONTINUACION LA RESPUESTA ------- ");
        System.out.println("La oracion tiene " + numero_Caracteres + " caracteres (sin contar los espacios en blanco).");
    }
}
