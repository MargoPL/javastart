package pl.sda.javastart.day4;

import pl.sda.javastart.day3.Person;

import java.util.List;

public class Student extends Person implements WorkingPerson, FlatInfoHolder {

    private int index;
    private double scolarship;
    private double incomeFromMom;

    public Student(String name, String surName, int age, int index, double scolarship, double incomeFromMom) {
        super(name, surName, age);
        this.index = index;
        this.scolarship = scolarship;
        this.incomeFromMom = incomeFromMom;
    }

    @Override
    public String toString() {
        return super.toString() +
                "index=" + index +
                ", scolarship=" + scolarship +
                ", incomeFromMom=" + incomeFromMom +
                "} ";
    }

    @Override
    protected boolean isParenthesisNeeded() {
        return false;
    }

    @Override
    public double getIncome() {
        return super.getIncome() + scolarship + incomeFromMom;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String getStreetPrefix() {
        return "al. ";
    }

    @Override
    public String getFlatInfo() {
        return "Słowackiego - u cioci";
    }
}
