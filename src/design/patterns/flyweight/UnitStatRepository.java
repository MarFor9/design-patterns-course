package design.patterns.flyweight;

public class UnitStatRepository {

    private static UnitStats destroyerUnitStats = new UnitStats("Destroyer", 500, 250, 70, 10, 800);

    private static UnitStats riflemanUnitStats = new UnitStats("Rifleman", 25, 5, 20, 25, 50);

    private static UnitStats teslaTankUnitStats = new UnitStats("TeslTank", 200, 100, 50, 25, 500);

    private UnitStatRepository(){}

    public static UnitStats getDestroyerStats() { return destroyerUnitStats;}

    public static UnitStats getRiflemanUnitStats() { return riflemanUnitStats;}

    public static UnitStats getTeslaTankUnitStats() { return teslaTankUnitStats;}
}
