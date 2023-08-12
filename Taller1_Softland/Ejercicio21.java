import java.util.Scanner;

//Pide al usuario una cadena y
//muestra cuántas veces aparece una letra específica en ella
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una Oracion: ");
        String cadena = scanner.nextLine();
        System.out.println("Escribe la letra que quieres contar: ");
        char letra = scanner.next().charAt(0);
        scanner.close();

        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                contador++;
            }
        }

        System.out.println(" ------- A CONTINUACION LA RESPUESTA ------- ");
        System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la oracion.");
    }
}
