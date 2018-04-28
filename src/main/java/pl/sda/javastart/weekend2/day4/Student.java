package pl.sda.javastart.weekend2.day4;

import pl.sda.javastart.weekend2.day3.Person;

public class Student extends Person {
    private int indexNumber;
    private int scholarship;
    private double incomeFromMom;


    public Student(String name, String surname, int age, int indexNumber, int scholarship, double incomeFromMom) {
        super(name, surname, age);
        this.indexNumber = indexNumber;
        this.scholarship = scholarship;
        this.incomeFromMom = incomeFromMom;
    }

    @Override
    public String toString() {

        return  super.toString() +
                "indexNumber=" + indexNumber +
                ", scholarship=" + scholarship +
                ", incomeFromMom=" + incomeFromMom +
                "} ";
    }
}
