import java.util.Date;

public class RentalOnSite extends Rental{
    private String comments;

    public RentalOnSite(Date startDate, Date endDate, Customer customer, Car car, RentalOffice pickUpOffice, String comments) {
        super(startDate, endDate, customer, car, pickUpOffice);
        this.comments = comments;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
