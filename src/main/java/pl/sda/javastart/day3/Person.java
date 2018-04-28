package pl.sda.javastart.day3;

import pl.sda.javastart.day4.Student;

public abstract class Person {
    private String name;
    private String surName;
    private Integer age;

    public Person(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public double getIncome() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    protected Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                " {name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age
                + (isParenthesisNeeded() ? ")" : " ");
    }

    protected abstract boolean isParenthesisNeeded();
}
