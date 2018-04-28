package pl.sda.javastart.weekend2.day4;

import pl.sda.javastart.weekend2.day3.Person;

public class OOP2 {
    public static void main(String[] args) {
       // toStringEqualsExample();

        Person person = new Person("Tomasz");
        Pensioner pensioner = new Pensioner("Adam", "Nowak", 78, 800);
        Student student = new Student("Maciek", "Nowak", 19, 123123, 100, 120);
        Worker worker = new Worker("Jan", "Nowak", 23, 1000, "Physical Worker");

        printPersons(person, pensioner, student, worker);


    }

    private static void printPersons(Person person, Pensioner pensioner, Student student, Worker worker) {
        System.out.println(person.toString());
        System.out.println(pensioner.toString());
        System.out.println(student.toString());
        System.out.println(worker.toString());
    }

    private static void toStringEqualsExample() {
        User userOne = new User("Joseph","JJ23","Joseph123");
        User userTwo = new User("Joseph","JJ23","Joseph123");

        System.out.println(userOne.equals(userTwo));
    }
}
