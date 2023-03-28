package design.patterns.builder.director;

public class HouseDirector {
    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void buildHouse() {
        houseBuilder.buildFloors();
        houseBuilder.buildRooms();
        houseBuilder.buildWalls();
    }

    public House getHouse() {
        return this.houseBuilder.getHouse();
    }
}
