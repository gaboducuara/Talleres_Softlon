import java.util.Scanner;

//Escribe un programa que pida al usuario un número y verifique si es positivo, negativo o cero.
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner usuario_numero = new Scanner(System.in);
        System.out.println(" ------- A CONTINUACION LA RESPUESTA ------- ");
        System.out.print("Digita un número: ");
        int numero = usuario_numero.nextInt();
        System.out.println(numero > 0 ? "El número es positivo." : numero < 0 ? "El número es negativo." : "El número es cero.");
    }
}
