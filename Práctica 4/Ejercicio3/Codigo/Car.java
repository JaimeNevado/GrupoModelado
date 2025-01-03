import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Car {
    private String licensePlate;
    private List<Rental> rentals;
    private RentalOffice rentalOffice;
    private Model model;
    private State state;
    private Date backToServiceDate;
    private Car substitutionCar;

    public Car(String licensePlate, Model model, RentalOffice rentalOffice){
        this.licensePlate = licensePlate;
        this.model = model;
        this.model.addCar(this);
        this.rentalOffice = rentalOffice;
        this.rentals = new ArrayList<Rental>();
        this.state = new InServiceState();
        this.substitutionCar = null;
    }

    public void takeOutOfService(Date backToServiceDate) {
        state.takeOutOfService(this, backToServiceDate);
        List<Car> cars = model.getCars();
        boolean found = false;

        for (int i = 0; i < cars.size() && !found; i++) {
            if (cars.get(i).state.getClass().equals(InServiceState.class) && cars.get(i).rentalOffice.equals(this.rentalOffice)) {
                substitutionCar = cars.get(i);
                found = true;
            }
        }
    }

    public Car getSubstitutionCar() {
        return substitutionCar;
    }

    public void setSubstitutionCar(Car substitutionCar) {
        this.substitutionCar = substitutionCar;
    }

    public boolean isOutOfService() {
        return state instanceof OutOfServiceState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Date getBackToServiceDate() {
        return backToServiceDate;
    }

    public void setBackToServiceDate(Date backToServiceDate) {
        this.backToServiceDate = backToServiceDate;
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
