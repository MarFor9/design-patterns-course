package design.patterns.factory.car.factory.task.cars;

public abstract class Car {
    private int EngineCapacity;
    private String fuelType;
    private int yearProduction;

    public Car(int engineCapacity, String fuelType, int yearProduction) {
        EngineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.yearProduction = yearProduction;
    }

    public int getEngineCapacity() {
        return EngineCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public WheelSide getSteeringWheelPosition() {
        return null;
    }
}
