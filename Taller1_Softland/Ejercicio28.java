

//Suma de elementos: Escribe un programa que calcule la suma de todos los elementos en un arreglo de enteros.

public class Ejercicio28 {
    public static void main(String[] args) {
        int[] arreglo = {100, 255, 300, 421, 5};
        int suma = 0;

        for (int elemento : arreglo) {
            suma += elemento;
        }

        System.out.println(" ------- A CONTINUACION LA RESPUESTA ------- ");
        System.out.println("La suma de los elementos del arreglo es: " + suma);
    }
}
