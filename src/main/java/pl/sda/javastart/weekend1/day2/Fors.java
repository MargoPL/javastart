package pl.sda.javastart.weekend1.day2;

import java.util.function.Function;
import java.util.stream.IntStream;

public class Fors {
    public static void main(String[] args) {
        //printFewNaturalNumbers(2, 7);
//        System.out.println(printFewNaturalNumbersWithResultInString(2, 7, (x) -> (Math.pow((double) x, 3))));
//        System.out.println(printFewNaturalNumbersWithResultInString(2, 7, (x) -> (Math.pow((double) x, 2))));
//        printFewNaturalNumbersWithTheirCubes(2, 7);
/*
        countdown(10);
        countdownWiythPlusPlus(10);
        System.out.println("printFewNaturalNumbersEven");
        printFewNaturalNumbersEven(2, 6);
        System.out.println("printFewNaturalNumbersEvenWithContinue");
        printFewNaturalNumbersEvenWithContinue(2, 6);
        System.out.println("printFewNaturalNumbersEvenWithStream");
        printFewNaturalNumbersEvenWithStream(2, 6);
*/
        fibonacci(10);
    }

    public static void tenTimesHelloWorld() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world! " + i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world 2! " + (i + 1));
        }
    }

    public static void printFewNaturalNumbersEvenWithStream(int min, int max) {
        IntStream.range(min, max + 1).filter(element -> element % 2 == 0)
                .forEach(e -> System.out.println(e));
    }


    public static void printFewNaturalNumbersEvenWithContinue(int min, int max) {
        for (int i = min; i <= max; i++) {
            if (i % 2 != 0) {
                continue; //przejście do następnej iteracji
            }
            System.out.println(i);
        }
    }

    public static void printFewNaturalNumbersEven(int min, int max) {
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void printFewNaturalNumbers(int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }
    }

    public static void countdownWiythPlusPlus(int max) {
        for (int i = 0; i < max; i++) {
            System.out.println("Do końca zostało " + (max - i));
        }
    }

    public static void countdown(int max) {
        for (int i = max; i >= 1; i--) {
            System.out.println(i);
            if (i == 1) {
                System.out.println("BOOM");
            }
        }
    }

    public static void printFewNaturalNumbersWithTheirCubes(int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.println(i + " - jej szścian = " + Math.pow(i, 3));
        }
    }

    //ciekawostka
    public static String printFewNaturalNumbersWithResultInString(int min, int max, Function<Double, Double> function) {
        String result = "";
        for (int i = min; i <= max; i++) {
            result = result + function.apply((double) i) + " ";
        }
        return result;
    }

    public static void fibonacci(int elementsToShow) {
        int element1 = 0;
        int element2 = 1;
        int sumOfElements;

        for (int i = 1; i <= elementsToShow; i++) {
            System.out.println(element2);
            sumOfElements = element1 + element2;
            element1 = element2;
            element2 = sumOfElements;
        }
    }
    public static void printNumbersInTowerInRows(int n){
//        String s = "";
        for(int i = 1;i<=n;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
