

// Clase abstracta para las notificaciones por correo electrónico
public abstract class NotificacionCorreoElectronico implements Notificacion {

    protected String remitente;
    protected String destinatario;
    protected String asunto;
     public NotificacionCorreoElectronico() {
     }

    public NotificacionCorreoElectronico(String remitente, String destinatario, String asunto) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.asunto = asunto;
    }





}

