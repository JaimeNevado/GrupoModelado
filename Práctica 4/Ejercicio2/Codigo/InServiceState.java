import java.util.Date;

public class InServiceState implements State {
    @Override
    public void takeOutOfService(Car car, Date backToServiceDate) {
        System.out.println("Putting car out of service until: " + backToServiceDate);

        car.setBackToServiceDate(backToServiceDate);
        car.setState(new OutOfServiceState());
    }
}
