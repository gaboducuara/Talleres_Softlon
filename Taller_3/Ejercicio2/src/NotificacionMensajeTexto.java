// Clase abstracta para las notificaciones por mensaje de texto
    public abstract class NotificacionMensajeTexto implements Notificacion {
    // Atributos comunes a todas las notificaciones por mensaje de texto
    protected String numeroOrigen;
    protected String numeroDestino;

    public NotificacionMensajeTexto() {
    }

    public NotificacionMensajeTexto(String numeroOrigen, String numeroDestino) {
        this.numeroOrigen = numeroOrigen;
        this.numeroDestino = numeroDestino;
    }
}
