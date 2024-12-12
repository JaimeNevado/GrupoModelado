import java.util.ArrayList;
import java.util.List;

public class Model {
    private String name;
    private int pricePerDay;
    private List<Car> cars;

    public Model(String name, int pricePerDay) {
        this.name = name;
        this.pricePerDay = pricePerDay;
        this.cars = new ArrayList<Car>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
