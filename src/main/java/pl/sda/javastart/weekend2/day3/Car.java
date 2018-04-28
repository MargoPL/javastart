package pl.sda.javastart.weekend2.day3;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDateTime;

public class Car {
    private String model;
    private String manufacturer;
    private String color;
    private double basePrice;
    private double engineCapacity;
    private LocalDateTime manufacturedDate;
    private String options;
    private int doorsNumber;

//    @Override
//    public String toString() {
//        return StringUtils.defaultIfBlank(manufacturer,"")+", "+
//                StringUtils.defaultIfBlank(model,"")+", "+
//                StringUtils.defaultIfBlank(color,"");
//    }


    public Car(String model, String manufacturer, String color, double basePrice, double engineCapacity, LocalDateTime manufacturedDate, String options, int doorsNumber) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.color = color;
        this.basePrice = basePrice;
        this.engineCapacity = engineCapacity;
        this.manufacturedDate = manufacturedDate;
        this.options = options;
        this.doorsNumber = doorsNumber;
    }

    public Car() {

    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", color='" + color + '\'' +
                ", basePrice=" + basePrice +
                ", engineCapacity=" + engineCapacity +
                ", manufacturedDate=" + manufacturedDate +
                ", options='" + options + '\'' +
                ", doorsNumber=" + doorsNumber +
                '}';
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public String getManufacturerAndModel() {
//        return manufacturer + " " + model;
        return StringUtils.defaultIfBlank(manufacturer,"")+
                StringUtils.defaultString(model,"");

    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public LocalDateTime getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(LocalDateTime manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    public String getModel(){
        return model;

    }
}
