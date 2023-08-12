import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private int Cedula;

    public Cliente (String nombre , int Cedula) {
        super();
        this.nombre = nombre;
        this.Cedula = Cedula;
    }

    private List<String> Cliente = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCedula() {
        return Cedula;
    }
    public void setCedula(int cedula) {
        Cedula = cedula;
    }
    public void agregarNota(String Cliente) {
        this.Cliente.add(Cliente);
    }
}
