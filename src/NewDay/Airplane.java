package NewDay;

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

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
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

    static void compareAirplanes(Airplane a,Airplane b){
        if(a.getLength()>b.getLength()){
            System.out.println("Airplane "+a.getManufacturer()+ " have length more than "+b.getManufacturer());
        }else{
            System.out.println("Airplane "+b.getManufacturer()+ " have length more than "+a.getManufacturer());
        }
    }
}
