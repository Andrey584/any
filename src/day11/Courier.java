package day11;

public class Courier implements Worker {
    private int salary;
    private static final int THIS_SALARY = 100;
    private static final int THIS_PREMIA = 50000;
    private boolean isPayed;
    Warehouse w;
    public Courier(Warehouse w){
        this.w = w;

    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += THIS_SALARY;
        w.interCountDeliveredOrders();


    }

    @Override
    public void bonus() {
        if(w.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока недоступен");
            return;
        }
        if(isPayed){
            System.out.println("Бонус уже выплачивался");
            return;
        }

        salary += THIS_PREMIA;
        System.out.println("Выплачен бонус");
        isPayed = true;


    }
}
