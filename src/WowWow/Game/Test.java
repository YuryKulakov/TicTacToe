package WowWow.Game;

public class Test {
    public static void main(String[] args) {

        Warrior war = new Warrior();
        Paladin pal = new Paladin();
        Magician mag = new Magician();
        Shaman sh = new Shaman();

        System.out.println(pal);
        war.physicalAttack(pal);
        System.out.println(pal);
        System.out.println("_____________________________");
        System.out.println(mag);
        pal.physicalAttack(mag);
        System.out.println(mag);
        System.out.println("_____________________________");
        sh.healTeammate(mag);
        System.out.println(mag);
        System.out.println("_____________________________");
        System.out.println(pal);
        mag.magicalAttack(pal);
        System.out.println(pal);
        System.out.println("_____________________________");
        System.out.println(war);
        sh.physicalAttack(war);
        System.out.println(war);
        System.out.println("_____________________________");
        System.out.println(pal);
        pal.healHimself();
        System.out.println(pal);
        System.out.println("_____________________________");
        System.out.println(mag);
        for(int i=0;i<5;i++) {
            war.physicalAttack(mag);
        }

        System.out.println(mag);

    }
}
