package design.patterns.flyweight.enumapproach;

class Destroyer {

    private int x;
    private int y;
    private int hpLeft = UnitStatsEnum.DESTROYER.getHp();
    private final UnitStatsEnum stats = UnitStatsEnum.DESTROYER;

    public Destroyer(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHpLeft() {
        return hpLeft;
    }

    public UnitStatsEnum getStats() {
        return stats;
    }
}
