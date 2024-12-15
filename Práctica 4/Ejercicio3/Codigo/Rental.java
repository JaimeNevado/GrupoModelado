import java.util.*;

public abstract class Rental {
    private Date startDate;
    private Date endDate;
    private Customer customer;
    private Car car;
    private PromotionStrategy promotionStrategy;

    public Rental(Date startDate, Date endDate, Customer customer, Car car, PromotionStrategy promotionStrategy) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.customer = customer;
        this.car = car;
        this.promotionStrategy = promotionStrategy != null ? promotionStrategy : new NoPromotion();
    }

    public int getPrice() {
        long diffInDays = getDaysOfRental(endDate, startDate);
        int basePrice = car.getModel().getPricePerDay() * (int)diffInDays;

        return promotionStrategy.applyPromotion(basePrice);
    }

    private long getDaysOfRental(Date end, Date start) {
        long diffInMilliseconds = end.getTime() - start.getTime();

        return diffInMilliseconds / (1000 * 60 * 60 * 24);
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

}