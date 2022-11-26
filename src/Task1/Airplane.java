package Task1;

public class Airplane {
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
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

    String manufacturer;
    int year;
    int length;
    int weight;

    public int getFuel() {
        return fuel;
    }

    int fuel=0;

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = fuel;
    }

    void info(){
        System.out.println(" Manufacturer: "+manufacturer+" Year of create: "+ year+" Length: "+length+" Weight: "+ weight+" Fuel: "+ fuel);
    }

    void fillUp(int fuelCount){
        this.fuel+=fuelCount;
    }
}
