import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String dni;
    private String name;
    private List<Rental> rentals;

    public Customer(String dni, String name) {
        this.dni = dni;
        this.name = name;
        this.rentals = new ArrayList<>();
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public int numberOfRentalsWithDifferentOffices() {
        int count = 0;
        Iterator<Rental> iterator = new RentalIterator(rentals); // Use iterator to traverse

        while (iterator.hasNext()) {
            Rental rental = iterator.next();
            if (rental instanceof WebRental) { // Check if it is a WebRental
                WebRental webRental = (WebRental) rental;
                if (!webRental.getPickUpOffice().equals(webRental.getDeliveryOffice())) {
                    count++;
                }
            }
        }
        return count;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(List<Rental> rentals) {
        this.rentals = rentals;
    }

}
