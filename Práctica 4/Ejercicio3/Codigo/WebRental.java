import java.util.Date;

public class WebRental extends Rental {
    private Integer deliveryTime; // Puede ser null si no está establecido
    private RentalOffice pickUpOffice;
    private RentalOffice deliveryOffice;

    public WebRental(Date startDate, Date endDate, Customer customer, Car car, RentalOffice pickUpOffice, RentalOffice deliveryOffice, PromotionStrategy promotionStrategy) {
        super(startDate, endDate, customer, car, promotionStrategy);
        this.deliveryTime = null; // Inicialmente null
        this.pickUpOffice = pickUpOffice;
        this.deliveryOffice = deliveryOffice;
    }

    public RentalOffice getPickUpOffice() {
        return pickUpOffice;
    }

    public void setPickUpOffice(RentalOffice pickUpOffice) {
        this.pickUpOffice = pickUpOffice;
    }

    public RentalOffice getDeliveryOffice() {
        return deliveryOffice;
    }

    public void setDeliveryOffice(RentalOffice deliveryOffice) {
        this.deliveryOffice = deliveryOffice;
    }

    // Método para establecer el tiempo de entrega
    public void setDeliveryTime(Integer deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    // Método para borrar el tiempo de entrega
    public void clearDeliveryTime() {
        this.deliveryTime = null;
    }

    // Método para obtener el tiempo de entrega
    public Integer getDeliveryTime() {
        return deliveryTime;
    }

    // Método para verificar si el tiempo de entrega está definido
    public boolean hasDeliveryTime() {
        return deliveryTime != null;
    }
}
