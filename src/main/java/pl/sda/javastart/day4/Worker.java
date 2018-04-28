package pl.sda.javastart.day4;

import pl.sda.javastart.day3.Person;

public class Worker extends Person {

    private double salary;
    private String position;


    public Worker(String name, String surName, int age, double salary,String position) {
        super (name, surName, age);
        this.salary = salary;
        this.position = position;
    }

    @Override
    public String toString() {
        return super.toString() +
                "salary=" + salary +
                ", position='" + position + '\'' +
                "} " ;
    }

    @Override
    protected boolean isParenthesisNeeded() {
        return true;
    }

    @Override
    public double getIncome() {
        return super.getIncome() + salary;
    }

    public String getPosition() {
        return position;
    }
}
