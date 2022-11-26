package NewDay;

import java.util.Random;


public class Task {
    public static void main(String[] args) {
        Random rand = new Random();
        int min=90;
        int max=100;
        int diff=max-min;
        int r=rand.nextInt(diff+1)+min;
        Player pl1= new Player(r);
        Player pl2= new Player(r);
        Player pl3= new Player(r);
        Player pl4= new Player(r);
        Player pl5= new Player(r);
        Player pl6= new Player(r);
        Player.show();
        for(int i=0;i<100;i++){
            pl1.run();
        }
        Player.show();

    }
}
