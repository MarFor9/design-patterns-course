package design.patterns.factory.car.factory.task;

import design.patterns.factory.car.factory.task.cars.BMWModel;
import design.patterns.factory.car.factory.task.cars.Car;
import design.patterns.factory.car.factory.task.cars.FordModel;

public class Main {
    public static void main(String[] args) {
        Factory commonwealthFactory = new CommonwealthFactory();
        Factory continentalFactory = new ContinentalFactory();

        Car bmw = commonwealthFactory.buildBMW(BMWModel.E60);
        System.out.println(bmw.getSteeringWheelPosition());

        Car ford = continentalFactory.buildFord(FordModel.CMAX);
        System.out.println(ford.getSteeringWheelPosition());
    }
}
