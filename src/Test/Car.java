package Test;

public class Car {
    private String model;
    private String color;
    private int yearOfCreate;

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearOfCreate() {
        return yearOfCreate;
    }

    public Car(String model,String color,int yearOfCreate) {
        this.model = model;
        this.color = color;
        this.yearOfCreate = yearOfCreate;
    }
}
