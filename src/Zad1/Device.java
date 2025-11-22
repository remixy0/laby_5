package Zad1;

public class Device {
    private String brand;
    private String model;
    private int year;

    public Device(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void getInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Laptop extends Device {
    int batteryLife;
    public Laptop(String brand, String model, int year, int batteryLife) {
        super(brand, model, year);
        this.batteryLife = batteryLife;
    }

    public void getInfo(){
        super.getInfo();
        System.out.println("Battery life: " + batteryLife);
        System.out.println("");
    }
}

class Mobile extends Device {
    int screenSize;
    public Mobile(String brand, String model, int year, int screenSize) {
        super(brand, model, year);
        this.screenSize = screenSize;
    }
    public void getInfo(){
        super.getInfo();
        System.out.println("Screen size: " + screenSize);
        System.out.println("");
    }
}