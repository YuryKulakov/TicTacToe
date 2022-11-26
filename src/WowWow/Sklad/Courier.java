package WowWow.Sklad;

public class Courier implements Worker {
    private int salary = 100;
    private int isPayed;
    private int cpo1;
    private boolean bonus = false;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getIsPayed() {
        return isPayed;
    }

    public void setIsPayed(int isPayed) {
        this.isPayed = isPayed;
    }

    public Courier(Warehouse w) {
        this.salary = salary;
        this.isPayed = isPayed;
        cpo1 = w.getCountDeliveredOrders();
    }

    public void doWork() {
        isPayed += salary;
        cpo1++;
    }

    public void bonus() {
        if (cpo1 >= 10000 && bonus == false) {
            isPayed += 50000;
            bonus = true;
        } else if (cpo1 < 10000) {
            System.out.println("Бонус еше не доступен, осталось: " + (10000 - cpo1) + " заказов");
        } else if (bonus = true) {
            System.out.println("Бонус уже выплачен");
        }
    }

    public String toString() {
        return "Доставлено заказов: " + cpo1 + " Выплачено з/п: " + isPayed;
    }
}
