package WowWow.Sklad;

public class Picker implements Worker {
    private int salary = 80;
    private int isPayed;
    int cpo;
    boolean bonus = false;

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

    public Picker(Warehouse w) {
        cpo = w.getCountPickedOrders();
    }

    @Override
    public void doWork() {
        isPayed += salary;
        cpo++;
    }

    public void bonus() {
        if (cpo >= 10000 && bonus == false) {
            isPayed += 70000;
            bonus = true;
        } else if (cpo < 10000) {
            System.out.println("Бонус еше не доступен, осталось: " + (10000 - cpo) + " заказов");
        } else if (bonus = true) {
            System.out.println("Бонус уже выплачен");
        }
    }

    public String toString() {
        return "Собрано заказов: " + cpo + " Выплачено з/п: " + isPayed;
    }
}
