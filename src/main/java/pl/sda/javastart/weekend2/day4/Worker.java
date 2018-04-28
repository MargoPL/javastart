package pl.sda.javastart.weekend2.day4;

import pl.sda.javastart.weekend2.day3.Person;

public class Worker extends Person {
    private int salary;
    private String position;


    public Worker(String name, String surname, int age, int salary, String position) {
        super(name, surname, age);
        this.salary = salary;
        this.position = position;
    }

    @Override
    public String toString() {
        return super.toString() +
                "salary=" + salary +
                ", position='" + position + '\'' +
                "} " + super.toString();
    }
}
