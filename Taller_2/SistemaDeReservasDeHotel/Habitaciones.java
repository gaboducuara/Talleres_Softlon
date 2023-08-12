public class Habitaciones {

    private String referencia;
    private Cliente[] listaCliente;

    public Habitaciones (String referencia){
        super();
        this.referencia = referencia;
        this.listaCliente = listaCliente;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Cliente[] getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(Cliente[] listaCliente) {
        this.listaCliente = listaCliente;
    }


//    public static void main(String[] args) {
//        List<String> Habitacion = new ArrayList<>();
//        Habitacion.add("Habitacion  NUMERO_1");
//        Habitacion.add("Habitacion  NUMERO_2");
//        Habitacion.add("Habitacion  NUMERO_3");
//        Habitacion.add("Habitacion  NUMERO_4");
//        Habitacion.add("Habitacion  NUMERO_5");
//        System.out.println(Habitacion);
//    }
}
