package design.patterns.factory.units;

public abstract class MechanizedUnit {
    private int hp;
    private int exp;
    private int dmgDone;

    protected MechanizedUnit(int hp, int exp, int dmgDone) {
        this.hp = hp;
        this.exp = exp;
        this.dmgDone = dmgDone;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getDmgDone() {
        return dmgDone;
    }

    public void setDmgDone(int dmgDone) {
        this.dmgDone = dmgDone;
    }
}
