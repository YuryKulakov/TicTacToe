package WowWow.Game;

public class Paladin extends Hero implements Healer, PhysAttack {
    private double physAttack;
    private double magicAttack;
    private double physDef;
    private double magicDef;

    public Paladin() {
        this.physAttack = 15;
        this.magicAttack = 0;
        this.physDef = 0.5;
        this.magicDef = 0.2;
    }

    @Override
    public void healHimself() {

            this.health += 25;
            if (this.health > HEALTH_MAX) {
                this.health = HEALTH_MAX;
            }

    }

    @Override
    public void healTeammate(Hero hero) {

            hero.health += 10;
            if (hero.health > HEALTH_MAX) {
                hero.health = HEALTH_MAX;
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

    public String toString() {
        return "health: " + getHealth();
    }
}
