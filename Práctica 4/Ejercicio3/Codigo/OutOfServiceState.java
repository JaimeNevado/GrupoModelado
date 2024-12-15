import java.util.Date;

public class OutOfServiceState implements State {
    @Override
    public void takeOutOfService(Car car, Date backToServiceDate) {
        System.out.println("El coche ya está fuera de servicio. No se ha tomado ninguna acción.");
    }
}
