import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    private String moneda;

    public static void main(String[] args) {

        EXTERNA:
        while(true) {
            System.out.println("Conversor de monedas");
            System.out.println("1 - euro a dolar\n" + "2 - peso colombiano a dolar\n"
            + "3 - peso argentino a dolar\n" + "4 - peso mexicano a dolar\n"
            + "5 - sol peruano a dolar\n" + "6 - salir");
            System.out.println("INGRESE UNA OPCION: ");
            Scanner leer = new Scanner(System.in);
            char opcion = leer.next().charAt(0);

            switch (opcion){
                case'1':
                    convertir(0.91 , "euro");
                    break;
                case'2':
                    convertir(4051.71, "Colombia");
                    break;
                case'3':
                    convertir(284.12 , "Argentino");
                    break;
                case'4':
                    convertir(17.10 , "Mexico");
                    break;
                case'5':
                    convertir(3.69 , "Peru");
                    break;
                case'6':
                    System.out.println("Cerrando Programa");
                    break EXTERNA;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }

    }
    static void convertir(Double valorDolar , String pais){
        Scanner leer = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad de %s:", pais);
        double cantidadMoneda = leer.nextDouble();

        double dolares = cantidadMoneda / valorDolar;
        dolares = (double) Math.round(dolares * 100d) / 100;

        System.out.println(" ---------------------------------- ");
        System.out.println("| Tienes $" + dolares + "Dolares |");
        System.out.println(" ---------------------------------- ");
    }
}