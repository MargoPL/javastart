package pl.sda.javastart.weekend1.day1;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner oneScanner = new Scanner(System.in);
        System.out.println("Wprowadź pierwszą liczbę:");
        double aa; //deklaracja
        aa = oneScanner.nextDouble();
        double a = oneScanner.nextDouble();
        System.out.println("Wprowadź drugą liczbę:");
        double b = oneScanner.nextDouble();

        double result = adder(a, b);
        System.out.println(result + " " + (a - b));

        System.out.println("a + b = " + (a + b)); //użycie bez metody
        System.out.println("a + b = " + adder(a, b)); //użycie z metodą

        System.out.println("a * b = " + (a * b));//użycie bez metody
        System.out.println("a * b = " + multiplier(a, b)); //użycie z metodą

        System.out.println("" + a + " + " + b + " = " + result);
        System.out.println("" + a + " - " + b + " = " + (a - b));
        System.out.println("" + a + " * " + b + " = " + (a * b));
        System.out.println("" + a + " / " + b + " = " + (a / b));
        System.out.println("" + a + " % " + b + " = " + (a % b));

        System.out.println(Math.abs(a - b));
        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, b));
        System.out.println(Math.pow(a, b));

        System.out.printf("Square: %12.2f\n", Math.pow(a, b));
        System.out.printf("Cube: %14.2f\n", Math.pow(a, b));
        System.out.printf("Fourth power: %6.2f\n", Math.pow(a, 4));



    }

    public int add(int a,int b){
        return a + b;
    }

    public static double multiplier(double a, double b) {
        return a * b;
    }


    public static int adder(int a, int secondValue) {
        int result = a + secondValue;
        return result;
    }

    public static double adder(double a, double secondValue) {
        double result = a + secondValue;
        return result;
    }

}
