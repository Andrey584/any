package day11;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;


    public int getCountPickedOrders() {
        return countPickedOrders;
    }
    public void interCountPickerOrders(){
        countPickedOrders++;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }
    public void interCountDeliveredOrders(){
        countDeliveredOrders++;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countPickedOrders=" + countPickedOrders +
                ", countDeliveredOrders=" + countDeliveredOrders +
                '}';
    }
}
