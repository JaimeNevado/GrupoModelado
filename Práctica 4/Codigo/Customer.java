import java.util.List;

public class Customer {
    private String dni;
    private String name;
    private List<Rental> rentals;

    public Customer(String dni, String name) {
        this.dni = dni;
        this.name = name;
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

    //    public void makesRental(){
//        Rental rental = new Rental();
//        rentals.add(rental);
//    }

//    public int numberOfRentalsWithDifferentOffices() {
//        return (int) rentals.stream()
//                .filter(rental -> rental instanceof WebRental)
//                .filter(rental -> !rental.getPickUpOffice().equals(rental.getDropOffOffice()))
//                .count();
//    }
}
