//Tabla de multiplicar:
// Crea un programa que imprima las tablas de multiplicar del 1 al  10. Usa para esto una matriz
public class Ejercicio35 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del " + i + ":");
            for (int a = 1; a <= 10; a++) {
                System.out.println(i + " x " + a + " = " + (i * a));
            }
            System.out.println();
        }
    }
}
