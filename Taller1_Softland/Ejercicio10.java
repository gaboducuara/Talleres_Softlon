//Ejercicio 10: Crea un programa que muestre los primeros 20 números de la serie Fibonacci. La serie
        //Fibonacci se forma sumando los dos números
        //anteriores para obtener el siguiente número: 0, 1, 1, 2, 3, 5, 8, 13.

public class Ejercicio10 {
    public static void main(String[] args) {
        int numero_1 = 0;
        int numero_2 = 1;
        System.out.println(" ------- A CONTINUACION LA RESPUESTA ------- ");
        System.out.print("los siguientes resultados son : " + numero_1 + ", " + numero_2);
        for (int i = 0; i < 8; i++) {
            int siguienteNumero = numero_1 + numero_2;
            System.out.print(", " + siguienteNumero);
            numero_1 = numero_2;
            numero_2 = siguienteNumero;
        }
    }
}
