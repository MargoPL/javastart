package pl.sda.javastart.weekend1.day2;

import java.util.Scanner;

public class Whiles {
    public static void main(String... args) {
        whileBasics();
    }

    private static void whileBasics() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź ilość pozdrowień:");
        double howManyTimes = scanner.nextDouble();

        int i = 0;
        while (i < howManyTimes) {
            System.out.println("Cześć tu pętla while po raz " + i);
            i++;
        }

    }


}
