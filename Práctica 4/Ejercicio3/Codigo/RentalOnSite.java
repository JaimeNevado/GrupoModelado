import java.util.Date;

public class RentalOnSite extends Rental{
    private String comments;
    private RentalOffice pickUpOffice;

    public RentalOnSite(Date startDate, Date endDate, Customer customer, Car car, RentalOffice pickUpOffice, String comments, PromotionStrategy promotionStrategy) {
        super(startDate, endDate, customer, car, promotionStrategy);
        this.comments = comments;
        this.pickUpOffice = pickUpOffice;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
