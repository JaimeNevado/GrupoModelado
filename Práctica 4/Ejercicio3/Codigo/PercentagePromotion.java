public class PercentagePromotion implements PromotionStrategy {
    private double discountPercentage;

    public PercentagePromotion(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public int applyPromotion(int basePrice) {
        int finalPrice = (int) (basePrice * (1 - discountPercentage / 100));
        return Math.max(finalPrice, 0);
    }
}
