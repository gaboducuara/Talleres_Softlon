import java.util.ArrayList;
import java.util.List;

public class Reserva {
        private List<String> reservas = new ArrayList<>();

        public void hacerReserva(String habitacion) {
            System.out.println(!reservas.contains(habitacion)
                    ? reservas.add(habitacion)
                    : "Reserva realizada para " + habitacion );
        }

        public void cancelarReserva(String habitacion) {

            System.out.println(reservas.contains(habitacion)
                    ? (reservas.remove(habitacion)
                    ? "Reserva cancelada para " + habitacion : "")
                    : "No se encontró reserva para " + habitacion);
        }
    }


