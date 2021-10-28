package day11;

public class Picker implements Worker {
    private int salary;
    private static final int THIS_SALARY = 80;
    private static final int THIS_PREMIA = 70000;
    private boolean isPayed;
    Warehouse w;
    public Picker(Warehouse w){
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
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += THIS_SALARY;
        w.interCountPickerOrders();


    }

    @Override
    public void bonus() {
        if(w.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока недоступен");
            return;
        }
            if (isPayed) {
                System.out.println("Бонус уже выплачивался");
                return;
            }

            salary += THIS_PREMIA;
        System.out.println("Выплачен бонус");
            isPayed = true;

    }
}
