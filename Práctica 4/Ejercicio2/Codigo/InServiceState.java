import java.util.Date;

public class InServiceState implements State {
    @Override
    public void takeOutOfService(Car car, Date backToServiceDate) {
        System.out.println("Este coche estará fuera de servicio hasta: " + backToServiceDate);

        car.setBackToServiceDate(backToServiceDate);
        car.setState(new OutOfServiceState());
    }
}
