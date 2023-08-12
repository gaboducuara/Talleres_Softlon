import java.util.Scanner;

//Realiza un programa que calcule e imprima
//la serie de Fibonacci hasta un número dado ingresado por el usuario.
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digita un número entero: ");
        int numero = scanner.nextInt();
        int num_uno = 0;
        int num_dos = 1;

        System.out.println(" ------- A CONTINUACION LA RESPUESTA ------- ");
        System.out.print(num_uno + " " + num_dos);
        for (int i = 2; i < numero; i++) {
            int c = num_uno + num_dos;
            System.out.print(" " + c);
            num_uno = num_dos;
            num_dos = c;
        }
    }
}
