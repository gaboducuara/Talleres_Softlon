import java.util.Scanner;

//Crea un programa que pida al usuario un número
        //entero positivo y muestre su tabla de multiplicar hasta el 10.
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digita un número entero positivo: ");
        int numero = scanner.nextInt();
        System.out.println(" ------- A CONTINUACION LA RESPUESTA ------- ");
        System.out.println("Tabla del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
