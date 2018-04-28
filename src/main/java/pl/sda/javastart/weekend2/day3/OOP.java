package pl.sda.javastart.weekend2.day3;

public class OOP {
    public static void main(String[] args) {
        cars();
        referencesExample();
    }

    private static void referencesExample() {
        String text1 = "napis";
        String text2 = "napis";
        String text3 = new String("napis");

        System.out.println(text1==text2);
        System.out.println(text3==text2);

        Long val1 = 127L;
        Long val2 = 127L;

        System.out.println(val1==val2);

        Long val3 = 128L;
        Long val4 = 128L;

        System.out.println(val3==val4);
    }

    private static void cars() {
        Car car = new Car();
        car.setModel("A4");
        String model = car.getModel();
        Car myFirstCar = new Car();
        myFirstCar.setManufacturer("Opel");
        myFirstCar.setModel("Astra");
        String options = ("Nothing at all");
        myFirstCar.setOptions(options);
        myFirstCar.setColor("White");
        System.out.println(myFirstCar.toString());
    }
}
