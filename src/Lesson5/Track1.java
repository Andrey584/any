package Lesson5;

public class Track1 {
    public static void main(String[] args){
    Car car = new Car();
    car.setModel("Shkoda");
    car.setColor("rad");
    car.setYear(2015);

        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getYear() + ".");

    }
}
