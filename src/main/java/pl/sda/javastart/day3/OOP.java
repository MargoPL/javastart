package pl.sda.javastart.day3;

import com.sun.deploy.security.WIExplorerBrowserAuthenticator14;
import pl.sda.javastart.weekend1.day1.Calculator;

public class OOP {
    public static void main(String[] args) {
        cars();
//        referencesExample();
//        staticExample();
//        finalExamples();
    }

    private static void finalExamples() {
//        Car.WHEELS_NUMBER = 3;
        System.out.println(Car.WHEELS_NUMBER);
        Car car = new Car();
        System.out.println(car.getOwner().getName());

        car.getOwner().setName("Marian");
        System.out.println(car.getOwner().getName());
    }

    private static void staticExample() {
        Calculator calculator = new Calculator();
        calculator.add(2, 2); //Ta metoda jest niestatyczna - z obiektu

        CalculatorUtils.add(2, 2); //ta metoda jest statyczna
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

        long number1 = 1234L;
        long number2 = 1234L;
        long number3 = 1234L;
        Long number4 = 1234L;
        Long number5 = new Long(1234L);
        System.out.println(number1==number2);
        System.out.println(number1==number4);
        System.out.println(number2==number3);
        System.out.println(number5==number4);

    }

    private static void cars() {
        Car car = new Car();
        car.setModel("A4");
        car.setManufacturer("Audi");
        String model = car.getModel();

        System.out.println(Car.carsCounter);

        Car audi = new Car("Audi", "A4");

        Car car2 = new Car();
        car2.setManufacturer("      ");
        String mAnufacturerAndModel = car2.getMAnufacturerAndModel();
        System.out.println("Samochód: " + mAnufacturerAndModel + "!");

        int carsCounter = car2.carsCounter;

        Car myFirstCar = new Car();
        myFirstCar.setManufacturer("Skoda");
        myFirstCar.setModel("Fabia");
        String[] options = new String[]{"Air Conditioning", "Leather Interior"};
        myFirstCar.setOptions(options);
        myFirstCar.setColour("White");
        System.out.println(myFirstCar);
    }

}
