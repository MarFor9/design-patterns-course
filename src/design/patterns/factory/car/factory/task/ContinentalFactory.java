package design.patterns.factory.car.factory.task;

import design.patterns.factory.car.factory.task.cars.*;

public class ContinentalFactory implements Factory{
    @Override
    public Car buildBMW(BMWModel model) {
        switch (model) {
            case X5:
                return new BMW(100, "Disel", 2022, WheelSide.RIGHT);
            case E60:
                return new BMW(120, "GAS", 2021, WheelSide.RIGHT);
            default:
                throw new IllegalArgumentException("Unknown model");
        }
    }

    @Override
    public Car buildFord(FordModel model) {
        switch (model) {
            case CMAX:
                return new Ford(100, "Disel", 2022, WheelSide.RIGHT);
            case FOCUS:
                return new Ford(120, "GAS", 2021, WheelSide.RIGHT);
            default:
                throw new IllegalArgumentException("Unknown model");
        }
    }
}
