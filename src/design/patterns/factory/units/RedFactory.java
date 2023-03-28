package design.patterns.factory.units;

public class RedFactory extends Factory{
    @Override
    public InfantryUnit createInfantryUnit(UnitType type) {
        switch (type) {
            case RIFLEMAN:
                return new Rifleman(20, 0, 6);
            default:
                throw new UnsupportedOperationException("Unknown tipe");
        }
    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType type) {
        switch (type) {
            case TANK:
                return new Tank(75, 0, 35);
            default:
                throw new UnsupportedOperationException("Unknown tipe");
        }
    }

    @Override
    public AirUnit createAirUnit(UnitType type) {
        switch (type) {
            case HELICOPTER:
                return new Helicopter(50, 0, 30);
            default:
                throw new UnsupportedOperationException("Unknown tipe");
        }
    }
}
