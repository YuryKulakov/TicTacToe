package WowWow.Sklad;

public class Task1 {
    public static void main(String[] args) {
        Warehouse war1 = new Warehouse();
        Warehouse war2 = new Warehouse();
        Picker pick1 = new Picker(war1);
        Courier cour1 = new Courier(war1);
        Picker pick2 = new Picker(war1);
        Courier cour2 = new Courier(war1);

        System.out.println(pick1);
        System.out.println(cour1);

        businessProcess(pick1);
        businessProcess(cour1);

        System.out.println(pick1);
        System.out.println(cour1);

        System.out.println("____________________________________________________________");


        pick2.doWork();
        cour2.doWork();

        System.out.println(pick2);
        System.out.println(cour2);


    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }

}
