import java.util.ArrayList;
import java.util.List;

public class Car {
    private String licensePlate;
    private List<Rental> rentals;
    private RentalOffice rentalOffice;
    private Model model;

    public Car(String licensePlate, Model model, RentalOffice rentalOffice){
        this.licensePlate = licensePlate;
        this.model = model;
        this.rentalOffice = rentalOffice;
        this.rentals = new ArrayList<Rental>();
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(List<Rental> rentals) {
        this.rentals = rentals;
    }

    public RentalOffice getRentalOffice() {
        return rentalOffice;
    }

    public void setRentalOffice(RentalOffice rentalOffice) {
        this.rentalOffice = rentalOffice;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }
}
