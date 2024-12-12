import java.util.*;

public class Rental {
    private Date startDate;
    private Date endDate;
    private Customer customer;
    private Car car;
    private RentalOffice pickUpOffice;

    public Rental(Date startDate, Date endDate, Customer customer, Car car, RentalOffice pickUpOffice) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.customer = customer;
        this.car = car;
        this.pickUpOffice = pickUpOffice;
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

    public RentalOffice getPickUpOffice() {
        return pickUpOffice;
    }

    public void setPickUpOffice(RentalOffice pickUpOffice) {
        this.pickUpOffice = pickUpOffice;
    }

//    public String getPickUpOffice() {
//        String office = "";
//        return office;
//    }
//
//    public String getDropOffOffice() {
//        String office = "";
//        return office;
//    }
}