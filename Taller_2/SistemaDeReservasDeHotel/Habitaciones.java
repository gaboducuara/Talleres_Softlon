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

}
