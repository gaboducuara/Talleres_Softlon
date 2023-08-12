
import java.util.*;
public class Main {
        public static void main(String[] args) {

        Scanner obj=new Scanner(System.in);
        int valor1, valor2, resultado, respuesta;


            System.out.println("  ------- Empienza el Ejercicio ----------- ");
            System.out.println("\n");

            System.out.println("Ingresa el primer numero");
            valor1=obj.nextInt();
            System.out.println("Ingresa el segundo numero");
            valor2=obj.nextInt();
            System.out.println("Teclea la opcion correspondiente a la operacion que desea");
            System.out.println("\n");
            System.out.println("1._Suma 2._Resta 3._Multiplicacion 4._Division 5._ Cerrar Programa");
            respuesta=obj.nextInt();

            EXTERNAL:
            switch (respuesta){
                case 1:
                    resultado = valor1 + valor2;
                    System.out.println("La suma es igual a: " + " " + resultado);
                    break;
                case 2:
                    resultado = valor1 - valor2;
                    System.out.println("La resta es igual a:" + " " +  resultado);
                    break;
                case 3:
                    resultado = valor1 * valor2;
                    System.out.println("La multiplicacion es igual a:" + " " +  resultado);
                    break;
                case 4:
                    resultado = valor1 / valor2;
                    System.out.println("La Division es igual a:" + " " +  resultado);
                    break;
                case 5 :
                    System.out.println("Cerrando programa");
                    break EXTERNAL;
                default:
                    System.out.println("Opcion Incorrecta");
                    break;
            }
        }
}