package pl.sda.javastart.weekend2.day4;

import pl.sda.javastart.weekend2.day3.Person;

public class Pensioner extends Person {

    private int pension;

    public Pensioner(String name, String surname, int age, double pension) {
        super(name, surname, age);
        this.pension = (int) pension;
    }

    @Override
    public String toString() {
        return super.toString() +
                "pension=" + pension +
                "} ";
    }
}
