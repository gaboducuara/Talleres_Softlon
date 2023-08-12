import java.util.Scanner;

//Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad o menor de edad.
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner usuario_edad = new Scanner(System.in);
        System.out.print("Digita su edad: ");
        int edad = usuario_edad.nextInt();
        System.out.println(" ------- A CONTINUACION LA RESPUESTA ------- ");
        System.out.println(edad >= 18 ? "Eres mayor de edad." : "Eres menor de edad.");
    }
}
