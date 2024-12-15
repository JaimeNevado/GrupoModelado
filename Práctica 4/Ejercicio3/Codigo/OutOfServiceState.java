import java.util.Date;

public class OutOfServiceState implements State {
    @Override
    public void takeOutOfService(Car car, Date backToServiceDate) {
        System.out.println("Car is already out of service. No action taken.");
    }
}
