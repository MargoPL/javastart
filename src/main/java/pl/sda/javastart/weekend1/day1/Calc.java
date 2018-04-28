package pl.sda.javastart.weekend1.day1;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź pierwszą liczbę: ");
        double a = scanner.nextDouble();
        System.out.println("Wprowadź drugą liczbę: ");
        double b = scanner.nextDouble();
        System.out.println((a + b) + " \n" + (a - b) + " \n" + (a * b) + " \n" + (a / b));

        System.out.println("Wartość maksymalna: " + Math.max(a, b) + "\nWartość minimalna: " + Math.min(a, b));
        System.out.println("Wartość bezwzględna: " + Math.abs((Math.min(a, b) - Math.max(a, b))));
        System.out.println("A do potęgi B: " + Math.pow(a, b));



    }
}
