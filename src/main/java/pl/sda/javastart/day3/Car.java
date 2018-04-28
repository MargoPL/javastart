package pl.sda.javastart.day3;

import org.apache.commons.lang3.StringUtils;
import pl.sda.javastart.day4.Worker;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Car implements Vehicle{

    private String model;
    private String manufacturer;
    private String colour;
    private double basePrice;
    private double engineCapacity;
    private int hp;
    private LocalDateTime manufacturedDate;
    private String[] options;
    private int doorsNumber;

    public final Person owner = new Worker("Andrzej","Nowak",23,1000,"Physical");

    public static int carsCounter;

    public static final int WHEELS_NUMBER = 4;

    public static String sound() {
        return "bruum";
    }

    public static String doYouRide() {
        return "YES";
    }

    static {
        System.out.println("Statyczny blok inicjalizujący");
        carsCounter = 49;
    }

    {
        System.out.println("Blok inicjalizujący");
        carsCounter = carsCounter + 1;
    }

    public Car() {
    }

    public Car(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getMAnufacturerAndModel() {
//        return manufacturer + " " + model;
//        return manufacturer == null ? "" : manufacturer + " " + model == null ? "" : model;
        return StringUtils.defaultIfBlank(manufacturer, "") +
                StringUtils.defaultString(model, "");
    }

//    @Override
//    public String toString() {
//        return "Marka: " + StringUtils.defaultIfBlank(manufacturer, "") + ", " +
//                "Model: " + StringUtils.defaultIfBlank(model, "") + ". " +
//                "Wyposażenie: " + Arrays.toString(options);
//    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", colour='" + colour + '\'' +
                ", basePrice=" + basePrice +
                ", engineCapacity=" + engineCapacity +
                ", hp=" + hp +
                ", manufacturedDate=" + manufacturedDate +
                ", options=" + Arrays.toString(options) +
                ", doorsNumber=" + doorsNumber +
                '}';
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public LocalDateTime getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(LocalDateTime manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    public Person getOwner() {
        return owner;
    }
}
