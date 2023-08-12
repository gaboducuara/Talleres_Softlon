
//Escribe un programa que calcule el área de un
        //triángulo utilizando la fórmula de Herón.
        //El usuario debe ingresar las longitudes de los tres lados

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digita la longitud del primer lado: ");
        double lado_1 = scanner.nextDouble();
        System.out.print("Digita la longitud del segundo lado: ");
        double lado_2 = scanner.nextDouble();
        System.out.print("Digita la longitud del tercer lado: ");
        double lado_3 = scanner.nextDouble();
        double s = (lado_1 + lado_2 + lado_3) / 2;
        // formula de heron  " sqrt(s * (s - a) * (s - b) * (s - c)) "
        System.out.println(" ------- A CONTINUACION LA RESPUESTA ------- ");
        double area = Math.sqrt(s * (s - lado_1) * (s - lado_2) * (s - lado_3));
        System.out.println("El área del triángulo es " + area);
    }
}
