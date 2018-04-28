package pl.sda.javastart.weekend2.day3;

public class Person {
    private String name;
    private String surname;
    private Integer age;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void getIncome(int income){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  this.getClass().getSimpleName()+ "{" +"name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age;
    }
}
