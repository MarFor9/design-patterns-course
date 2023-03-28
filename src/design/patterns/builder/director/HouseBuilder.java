package design.patterns.builder.director;

public interface HouseBuilder {
    void buildWalls();

    void buildFloors();

    void buildRooms();

    House getHouse();
}
