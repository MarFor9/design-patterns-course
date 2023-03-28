package design.patterns.flyweight;

public class Destroyer {

    private int x;
    private int y;
    private int hpLeft;
    private UnitStats unitStats;

    public Destroyer(int x, int y) {
        unitStats = UnitStatRepository.getDestroyerStats();
        this.x = x;
        this.y = y;
        this.hpLeft = unitStats.getHp();
    }
}
