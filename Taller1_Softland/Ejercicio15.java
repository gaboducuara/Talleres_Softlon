import java.util.Scanner;

//Crea un programa que pida al usuario un número entero
// y determine si es un número capicúa.
//Un número capicúa es aquel que se lee igual de izquierda
// a derecha que de derecha a izquierda.
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digita un número entero: ");
        int numero = scanner.nextInt();
        int numero_Invertido = 0;
        int numero_Original = numero;
        while (numero != 0) {
            int digito = numero % 10;
            numero_Invertido = numero_Invertido * 10 + digito;
            numero /= 10;
        }
        System.out.println(" ------- A CONTINUACION LA RESPUESTA ------- ");
        System.out.println(numero_Original == numero_Invertido ? numero_Original + " es un número capicúa." : numero_Original + " no es un número capicúa.");
    }
}
