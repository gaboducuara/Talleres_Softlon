//Eliminar duplicados: Diseña un programa que elimine los elementos duplicados de un arreglo.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ejercicio30 {
    public static void main(String[] args) {
        Integer[] arreglo = {11, 2, 3, 2, 4, 5, 11, 2, 2, 2, 5, 4};
        Set<Integer> conjunto = new HashSet<>(Arrays.asList(arreglo));
        Integer[] arregloSinDuplicados = conjunto.toArray(new Integer[conjunto.size()]);

        System.out.println(" ------- A CONTINUACION LA RESPUESTA ------- ");
        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        System.out.println("Arreglo sin duplicados: " + Arrays.toString(arregloSinDuplicados));
    }
}
