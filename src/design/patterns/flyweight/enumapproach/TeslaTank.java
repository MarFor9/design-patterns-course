package design.patterns.flyweight.enumapproach;

class TeslaTank {
    private int x;
    private int y;
    private int hpLeft = UnitStatsEnum.TANK.getHp();
    private final UnitStatsEnum stats = UnitStatsEnum.TANK;

    public TeslaTank(int x, int y) {
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

    @Override
    public String toString() {
        return "TeslaTank{" +
                "x=" + x +
                ", y=" + y +
                ", hpLeft=" + hpLeft +
                ", stats=" + stats +
                '}';
    }
}
