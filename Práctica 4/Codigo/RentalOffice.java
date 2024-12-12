import java.util.ArrayList;
import java.util.List;

public class RentalOffice {
    private String address;
    private int feeForDelivery;
    private List<Car> cars;
    private List<Rental> rentals;
    private List<WebRental> webRentals;

    public RentalOffice(String address, int feeForDelivery) {
        this.address = address;
        this.feeForDelivery = feeForDelivery;
        cars = new ArrayList<Car>();
        rentals = new ArrayList<>();
        webRentals = new ArrayList<>();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFeeForDelivery() {
        return feeForDelivery;
    }

    public void setFeeForDelivery(int feeForDelivery) {
        this.feeForDelivery = feeForDelivery;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(List<Rental> rentals) {
        this.rentals = rentals;
    }

    public List<WebRental> getWebRentals() {
        return webRentals;
    }

    public void setWebRentals(List<WebRental> webRentals) {
        this.webRentals = webRentals;
    }
}
