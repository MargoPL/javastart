package pl.sda.javastart.weekend1.day2;

import java.util.Scanner;

public class Ifs {
    public static void main(String[] args) {

        System.out.println(answerCalling(false, true, true));
        System.out.println(answerCalling(true, true, false));
        System.out.println(answerCalling(false, true, false));

        System.out.println(answerCalling2(false, true, true));
        System.out.println(answerCalling2(true, true, false));
        System.out.println(answerCalling2(false, true, false));

    }

    private void calcIfs() {
        double a;
        double b;

        Scanner in = new Scanner(System.in);

        System.out.print("Wprowadź pierwszą liczbę: ");
        a = in.nextDouble();
        System.out.print("Wprowadź drugą liczbę: ");
        b = in.nextDouble();

        System.out.println();
        System.out.println("Co chcesz zrobić?");
        System.out.println("1-dodawanie, 2-odejmowanie, 3-mnożenie, 4-dzielenie");
        int wybor = in.nextInt();

        if (wybor == 1) {
            System.out.println("" + a + " + " + b + " = " + (a + b));
        } else if (wybor == 2) {
            System.out.println("" + a + " - " + b + " = " + (a - b));
        } else if (wybor == 3) {
            System.out.println("" + a + " * " + b + " = " + (a * b));
        } else if (wybor == 4) {
            System.out.println("" + a + " / " + b + " = " + (a / b));
        } else {
            System.out.println("Niepoprawny wybór!!!");
        }

    }

    public static boolean positiveOrNot(int value) {
        if (value >= 0) {
            return true;
        } else {
            return false;
        }

    }

    public static String checkWhichNumberIsBigger2(int a, int b) {
        if (a < b) {
            return "Druga liczba większa";
        }
        if (a > b) {
            return "Pierwsza jest większa";
        }
        return "Są równe";
    }

    public static String checkWhichNumberIsBigger(int a, int b) {
        if (a != b) {
            if (a < b) {
                return "Druga liczba większa";
            } else {
                return "Pierwsza jest większa";
            }
        } else {
            return "Są równe";
        }
    }

    public static boolean answerCalling2(boolean isMama, boolean isMorning, boolean isAsleep) {
        if (isAsleep) { //śpimy -> nie odbieramy
            return false;
        }
        if (isMorning && !isMama) {  //jeżeli jest rano to odbieramy tylko od mamy
            return false;
        }
        return true; //w pozostałych przypadkach odbieramy telefon
    }


    public static boolean answerCalling(boolean isMama, boolean isMorning, boolean isAsleep) {
        if (isMama == true) {
            if (isMorning == true) {
                if (isAsleep == true) {
                    System.out.println("we call");
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
