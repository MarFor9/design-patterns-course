package design.patterns.strategy.task;

public class Main {
    public static void main(String[] args) {
        PriceCalculator priceCalculator = new PriceCalculator();
        //Użytkownik nie jest zapisany do newslettera - normalna cena
        priceCalculator.setPriceStrategy(new RegularPrice());
        priceCalculator.calculate(100, false);
        //Użytkownik jest zapisany do newslettera - wybrana błędna strategia
        priceCalculator.setPriceStrategy(new RegularPrice());
        priceCalculator.calculate(100, true);
        //Użytkownik jest zapisany do newslettera
        priceCalculator.setPriceStrategy(new SalePrice());
        priceCalculator.calculate(100, true);
        //Użytkownik jest zapisany do newslettera - wybrana błędna strategia
        priceCalculator.setPriceStrategy(new SalePrice());
        priceCalculator.calculate(100, false);
    }
}
