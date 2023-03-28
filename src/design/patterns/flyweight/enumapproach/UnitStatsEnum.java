package design.patterns.flyweight.enumapproach;

enum UnitStatsEnum {
    TANK("TeslTank", 200, 100, 50, 25, 500),
    DESTROYER("Destroyer", 500, 250, 70, 10, 800),
    RIFLEMAN("Rifleman", 25, 5, 20, 25, 50);

    private String name;
    private int hp;
    private int armour;
    private int damageDealt;
    private int speed;
    private int resourceCost;

    UnitStatsEnum(String name, int hp, int armour, int damageDealt, int speed, int resourceCost) {
        this.name = name;
        this.hp = hp;
        this.armour = armour;
        this.damageDealt = damageDealt;
        this.speed = speed;
        this.resourceCost = resourceCost;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getArmour() {
        return armour;
    }

    public int getDamageDealt() {
        return damageDealt;
    }

    public int getSpeed() {
        return speed;
    }

    public int getResourceCost() {
        return resourceCost;
    }

    @Override
    public String toString() {
        return "{name='" + name + '\'' +
                ", hp=" + hp +
                ", armour=" + armour +
                ", damageDealt=" + damageDealt +
                ", speed=" + speed +
                ", resourceCost=" + resourceCost +
                '}';
    }
}
