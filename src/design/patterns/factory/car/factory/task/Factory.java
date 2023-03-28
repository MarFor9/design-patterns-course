package design.patterns.factory.car.factory.task;

import design.patterns.factory.car.factory.task.cars.BMWModel;
import design.patterns.factory.car.factory.task.cars.Car;
import design.patterns.factory.car.factory.task.cars.FordModel;

public interface Factory {
    Car buildBMW(BMWModel model);

    Car buildFord(FordModel model);
}
