public class AmountPromotion implements PromotionStrategy {
    private int discountAmount;

    public AmountPromotion(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public int applyPromotion(int basePrice) {
        int finalPrice = basePrice - discountAmount;
        return Math.max(finalPrice, 0);
    }
}
