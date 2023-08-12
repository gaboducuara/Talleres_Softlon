import java.util.Scanner;

//Pide al usuario un número decimal y muestra su valor redondeado
// a un número específico de decimales
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite un número decimal: ");
        double numero = scanner.nextDouble();

        System.out.print("Digite el número de decimales para redondear: ");
        int decimales = scanner.nextInt();

        double numero_Redondeado = Math.round(numero * Math.pow(10, decimales)) / Math.pow(10, decimales);

        System.out.println(" ------- A CONTINUACION LA RESPUESTA ------- ");
        System.out.println("El número redondeado a " + decimales + " decimales es: " + numero_Redondeado);
    }
}

