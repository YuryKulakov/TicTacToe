package WowWow.Game;

public class Hero {
    public double health;
    static final double HEALTH_MAX = 100;
    static final double HEALTH_MIN = 0;
    private double physAttack;
    private double magicAttack;
    private double physDef;
    private double magicDef;

    public double getPhysAttack() {
        return physAttack;
    }

    public double getMagicAttack() {
        return magicAttack;
    }

    public double getPhysDef() {
        return physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public Hero() {
        this.health = HEALTH_MAX;

    }

    public double getHealth() {
        return health;
    }

}
