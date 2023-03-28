package design.patterns.strategy.chef;

public class SoftBoiledEggCooker implements EggCooker{
    @Override
    public void cookEgg() {
        System.out.println("Gotuje jajka na miekko");
    }
}
