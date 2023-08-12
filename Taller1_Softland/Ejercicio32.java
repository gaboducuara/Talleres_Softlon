import java.util.Scanner;

//Buscar un elemento: Escribe un programa que busque un número específico
// en un arreglo y muestre su índice (o un mensaje si no se encuentra).
public class Ejercicio32 {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita el número que quieres buscar: ");
        int numero = scanner.nextInt();
        scanner.close();

        int indice = -1;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numero) {
                indice = i;
                break;
            }
        }
        System.out.println(" ------- A CONTINUACION LA RESPUESTA ------- ");
        System.out.println(indice != -1 ? "El número " + numero + " se encuentra en el índice " + indice + " del arreglo." : "El número " + numero + " no se encuentra en el arreglo.");
    }
}
