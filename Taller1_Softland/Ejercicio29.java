
//Encontrar el número más grande: Crea un programa que encuentre el número más grande en un arreglo de enteros.
public class Ejercicio29 {
        public static void main(String[] args) {
            int[] arreglo = {300, 2000, 33, 40, 51};
            int numeros = arreglo[0];

            for (int elementos : arreglo) {
                System.out.println(elementos > numeros ? numeros = elementos: "");
            }

            System.out.println(" ------- A CONTINUACION LA RESPUESTA ------- ");
            System.out.println("El número más grande en el arreglo es: " + numeros);
        }
}
