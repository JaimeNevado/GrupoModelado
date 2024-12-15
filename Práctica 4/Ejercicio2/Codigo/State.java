import java.util.Date;

public interface State {
    void takeOutOfService(Car car, Date backToServiceDate);
}
