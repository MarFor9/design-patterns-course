package design.patterns.strategy.task;

public class PriceCalculator {
    private PriceStrategy priceStrategy;

    public PriceStrategy getPriceStrategy() {
        return priceStrategy;
    }

    public void setPriceStrategy(PriceStrategy priceStrategy) {
        this.priceStrategy = priceStrategy;
    }

    public void calculate(int price, boolean isSignedUpForNewsletter ) {
        priceStrategy.calculatePrice(price, isSignedUpForNewsletter);
    }
}
