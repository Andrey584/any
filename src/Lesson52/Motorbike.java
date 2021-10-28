package Lesson52;

public class Motorbike {
    String model;
    String color;
    int year;

    public Motorbike(String model, String color, int year){
        this.model = model;
        this.color = color;
        this.year = year;

    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}
