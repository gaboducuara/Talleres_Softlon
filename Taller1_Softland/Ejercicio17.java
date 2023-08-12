import java.util.Scanner;

//Pide al usuario dos números enteros y muestra todos los
//números primos que se encuentran en ese rango
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digita el primer número: ");
        int numero_1 = scanner.nextInt();
        System.out.println("digita el segundo número: ");
        int numero_2 = scanner.nextInt();
        scanner.close();

        System.out.println(" ------- A CONTINUACION LA RESPUESTA ------- ");
        for (int i = numero_1; i <= numero_2; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
