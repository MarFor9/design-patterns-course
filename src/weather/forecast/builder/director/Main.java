package weather.forecast.builder.director;

public class Main {
    public static void main(String[] args) {

        HouseDirector houseDirector = new HouseDirector(new SmallHouseBuilder());
        houseDirector.buildHouse();
        House smallHouse = houseDirector.getHouse();

        houseDirector = new HouseDirector(new BigHouseBuilder());
        houseDirector.buildHouse();
        House bigHouse = houseDirector.getHouse();

        System.out.println(smallHouse);
        System.out.println(bigHouse);
    }
}
