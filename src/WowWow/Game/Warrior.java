package WowWow.Game;

public class Warrior extends Hero implements PhysAttack {
    private double physAttack;
    private double magicAttack;
    private double physDef;
    private double magicDef;

    public Warrior() {
        this.physAttack = 30;
        this.magicAttack = 0;
        this.physDef = 0.8;
        this.magicDef = 0;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double pA=0;
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


    public String toString() {
        return "Health: " + getHealth();
    }
}
