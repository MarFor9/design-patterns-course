package weather.forecast.builder.director;

public class BigHouseBuilder implements HouseBuilder {

    private House house;

    public BigHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildWalls() {
        this.house.setWalls("Big walls");
    }

    @Override
    public void buildFloors() {
        this.house.setFloors("Big floors");
    }

    @Override
    public void buildRooms() {
        this.house.setRooms("Big rooms");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
