package design.patterns.flyweight.enumapproach;

class Rifleman {
    private int x;
    private int y;
    private int hpLeft = UnitStatsEnum.RIFLEMAN.getHp();
    private final UnitStatsEnum stats = UnitStatsEnum.RIFLEMAN;

    public Rifleman(int x, int y) {
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
