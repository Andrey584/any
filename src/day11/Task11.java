package day11;



public class Task11 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);
        businessProcess(picker);

        System.out.println(picker.toString());
        businessProcess(courier);

        System.out.println(courier.toString());

        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);
        businessProcess(picker1);
        businessProcess(courier1);
        System.out.println(picker1.toString());
        System.out.println(courier1.toString());



    }


    static void businessProcess(Worker worker) {

        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }

        worker.bonus();

    }
}
