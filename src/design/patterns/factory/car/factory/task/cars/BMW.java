package design.patterns.factory.car.factory.task.cars;

public class BMW extends Car {

    private WheelSide wheel;

    public BMW(int engineCapacity, String fuelType, int yearProduction, WheelSide wheel) {
        super(engineCapacity, fuelType, yearProduction);
        this.wheel = wheel;
    }
    @Override
    public WheelSide getSteeringWheelPosition() {
        return wheel;
    }
}
