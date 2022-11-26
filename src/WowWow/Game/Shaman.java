package WowWow.Game;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {
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


    private double physAttack;
    private double magicAttack;
    private double physDef;
    private double magicDef;

    public Shaman() {
        this.physAttack = 10;
        this.magicAttack = 15;
        this.physDef = 0.2;
        this.magicDef = 0.2;
    }

    @Override
    public void healHimself() {

            this.health += 50;
            if (this.health > HEALTH_MAX) {
                this.health = HEALTH_MAX;
            }

    }

    @Override
    public void healTeammate(Hero hero) {
            hero.health += 30;
            if (hero.health > HEALTH_MAX) {
                hero.health = HEALTH_MAX;
            }

    }

    @Override
    public void magicalAttack(Hero hero) {
        magicAttack = (magicAttack - magicAttack * hero.getMagicDef());
        if(hero.health<0){
            hero.health=HEALTH_MIN;
        }else {
            hero.health = hero.getHealth() - magicAttack;
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

    public String toString() {
        return "health: " + getHealth();
    }
}
