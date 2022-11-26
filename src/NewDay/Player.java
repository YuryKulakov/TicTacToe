package NewDay;

public class Player {

    private int stamina;
    public static final int MAX_STAMINA = 0;
    static final int MIN_STAMINA = 100;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if(countPlayers<6) {
            countPlayers++;
        }else{
            countPlayers=6;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public static void setCountPlayers(int countPlayers) {
        Player.countPlayers = countPlayers;
    }

    public void run(){
        System.out.print(stamina+" ");
       if(stamina>0) {
           this.stamina--;
       }else{
           this.stamina=MIN_STAMINA;
       }
       if(this.stamina==MIN_STAMINA){
           if(countPlayers<0){
               countPlayers=0;
           }
           countPlayers--;
       }
    }
    public static void show(){
        int freePlaces=6-countPlayers;
        if(countPlayers<6){
            System.out.println("Команды не полные, на поле есть еще "+freePlaces+" свободных мест");
        }else{
            System.out.println("Свободных мест на поле больше нет");
        }
        System.out.println(countPlayers);

    }
}
