public abstract class NotificacionPush implements Notificacion{
    protected String app;
    protected String token;

    public NotificacionPush() {
    }

    public NotificacionPush(String app, String token) {
        this.app = app;
        this.token = token;
    }
}
