package WowWow.Game;

public class Magician extends Hero implements PhysAttack, MagicAttack {
    private double physAttack;
    private double magicAttack;
    private double physDef;
    private double magicDef;

    public Magician() {
        this.physAttack = 5;
        this.magicAttack = 20;
        this.physDef = 0;
        this.magicDef = 0.8;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double mA=0;
        mA = (getMagicAttack() - getMagicAttack() * hero.getMagicDef());
        if(hero.health<0){
            hero.health=HEALTH_MIN;
        }else {
            hero.health = hero.getHealth() - mA;
        }
    }

    @Override
    public void physicalAttack(Hero hero) {
        double pA;
        pA = (getPhysAttack() - getPhysAttack() * hero.getPhysDef());
        if(hero.health<0){
            hero.health=HEALTH_MIN;
        }else {
            hero.health = hero.getHealth() - pA;
        }
    }

    @Override
    public double getPhysAttack() {
        return physAttack;
    }



    @Override
    public double getMagicAttack() {
        return magicAttack;
    }


    @Override
    public double getPhysDef() {
        return physDef;
    }

    @Override
    public double getMagicDef() {
        return magicDef;
    }


    @Override
    public String toString() {
        return "health: " + getHealth();
    }
}
