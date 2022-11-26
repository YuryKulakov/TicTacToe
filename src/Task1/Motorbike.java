package Task1;

public class Motorbike {
    private String model;
    private String color;
    private int yearOfCreate;
    int yearDiff=0;

    public String getModel() {return model;}

    public void setModel(String model) {this.model = model;}

    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}

    public int getYearOfCreate() {return yearOfCreate;}

    public void setYearOfCreate(int yearOfCreate) {this.yearOfCreate = yearOfCreate;}

    public Motorbike(String model, String color, int yearOfCreate) {
        this.model = model;
        this.color = color;
        this.yearOfCreate = yearOfCreate;
    }

     void info (){
        System.out.println("This is motorbike");
    }

     int yearDifference (int year){
        if(year>yearOfCreate){
            yearDiff=year-yearOfCreate;
        }else{
            yearDiff=yearOfCreate-year;
        }
        return yearDiff;
    }
}
