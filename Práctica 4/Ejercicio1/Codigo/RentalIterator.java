import java.util.List;

public class RentalIterator implements Iterator<Rental> {
    private List<Rental> rentals;
    private int position;

    public RentalIterator(List<Rental> rentals) {
        this.rentals = rentals;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < rentals.size();
    }

    @Override
    public Rental next() {
        return rentals.get(position++);
    }
}
