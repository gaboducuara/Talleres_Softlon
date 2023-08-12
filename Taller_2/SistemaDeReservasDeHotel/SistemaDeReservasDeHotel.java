import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SistemaDeReservasDeHotel {

    private List<Habitaciones> listaHabitaciones = new ArrayList<>();
    private Scanner in = new Scanner(System.in);

    public void tipoHabitacion() {
    int opcion = 0;
    boolean salir = false;
//    GestionAlumnos gestion = new GestionAlumnos();

        do {
        System.out.println("**************  Menú Reservas  **************");
        System.out.println("* 1 - primera Habitacion ");
        System.out.println("* 2 - Segunda Habitacion ");
        System.out.println("* 3 - Tercera Habitacion ");
        System.out.println("* 0 - Salir");
        System.out.println("*********************************************");
        opcion = in.nextInt();

        switch (opcion) {
            case 1:
                seleccion("Habitacion  NUMERO 1");
                break;
            case 2:
                seleccion("Habitacion NUMERO 2");
                break;
            case 3:
                seleccion("Habitaciones NUMERO 3");
                break;
        }

        System.out.println("? Desea realizar otra reserva ? S/N");
        String estado = in.next().toUpperCase();
        if (!estado.contentEquals("s")) {
            salir = true;
        }
    } while(!salir);
}
    public void seleccion (String referencia) {
        System.out.println("Digite el numero de Clientes");
        int cantidad = in.nextInt();
        Cliente[] lista = new Cliente[cantidad];
        for(int i = 0; i < lista.length; i++) {
            System.out.println("Nombre: ");
            String nombre = in.next();
            System.out.println("Identificacion DNI (Cedula): ");
            int Cedula = in.nextInt();
            lista[i] = new Cliente(nombre, Cedula);
        }

        listaHabitaciones.add(new Habitaciones(referencia));
            for (Habitaciones habitacion : listaHabitaciones ) {
                System.out.println(habitacion);
        }
    }
}
