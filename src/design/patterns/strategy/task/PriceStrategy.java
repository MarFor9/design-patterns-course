package design.patterns.strategy.task;

public interface PriceStrategy {
    void calculatePrice(int price, boolean isSignedUpForNewsletter);
}
