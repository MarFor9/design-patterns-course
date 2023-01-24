package weather.forecast.builder.director;

public interface HouseBuilder {
    void buildWalls();

    void buildFloors();

    void buildRooms();

    House getHouse();
}
