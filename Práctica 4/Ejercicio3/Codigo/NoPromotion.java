public class NoPromotion implements PromotionStrategy {
    @Override
    public int applyPromotion(int basePrice) {
        return basePrice;
    }
}
