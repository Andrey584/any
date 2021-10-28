package DayDay8;

public class Airplane {
    String producer;
    int year;
    int length;
    int weight;
    int fuel;

    public Airplane(String producer, int year, int length, int weight){
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;

    }

    public void info(){
        System.out.println("Изготовитель: " + this.producer + ", " + "длина: " + this.length + ", " + "Вес: " + this.weight + ", " + "Кол-во топлива в баке: " + this.fuel);

    }
    public String toString(){
        return "Изготовитель: " + this.producer + ", " + "длина: " + this.length + ", " + "Вес: " + this.weight;
    }

    public int fillUp(int n){
        return n += this.fuel;
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

}

