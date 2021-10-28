package Day9;

public class Airplane {


    String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;

    }

    public void info() {
        System.out.println("Изготовитель: " + this.producer + ", " + "длина: " + this.weight + ", " + "Вес: " + this.weight + ", " + "Кол-во топлива в баке: " + this.fuel);

    }

    public int fillUp(int n) {
        return n += fuel;
    }


    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public static void compareAirplanes(Airplane airplane, Airplane airplane1) {
        if (airplane.length > airplane1.length)
            System.out.println(airplane + " длиннее");
        if (airplane.length < airplane1.length)
            System.out.println(airplane1 + " длиннее");
        if (airplane.length == airplane1.length)
            System.out.println(" Самолеты равны по длине");

    }

    public String toString(){
        return "Производитель " + producer;
    }

}



