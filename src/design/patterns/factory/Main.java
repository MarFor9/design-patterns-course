package design.patterns.factory;

import design.patterns.factory.units.*;

import static design.patterns.factory.units.UnitType.HELICOPTER;

public class Main {

    public static void main(String[] args) {

        Factory blueFactory = new BlueFactory();
        Factory redFactory = new RedFactory();

        MechanizedUnit redTank = redFactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit redInfantry = redFactory.createInfantryUnit(UnitType.RIFLEMAN);
        AirUnit redAirUnit = redFactory.createAirUnit(HELICOPTER);

        MechanizedUnit blueTank = blueFactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit blueInfantry = blueFactory.createInfantryUnit(UnitType.RIFLEMAN);
        AirUnit blueAirUnit = blueFactory.createAirUnit(HELICOPTER);


    }

}
