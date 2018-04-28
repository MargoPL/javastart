package pl.sda.javastart.weekend1.day1;

import java.time.LocalDateTime;

public class HelloWorld {

    public static void main(String[] args) {
        methodName();
    }

    public static void methodName(){

        System.out.println("Hello World!".toUpperCase());
        System.out.println(LocalDateTime.now());
        System.out.println("Adam" + 4 + false);
        System.out.println("Michał");
        System.out.println("Ada");
        System.out.println("Marcin\n" + "Dominik\n" + "Robert\n");
        System.out.println("\\Marcin\nDominik\nRobert\n");

    }


    public static void printTextPartOne(){
        System.out.println("Hello World!".toUpperCase());
        System.out.println(LocalDateTime.now());
        System.out.println("Adam" + 4 + false);
        System.out.println("Michał");
        System.out.println("Ada");
        System.out.println("Marcin\n" + "Dominik\n" + "Robert\n");
        System.out.println("\\Marcin\nDominik\nRobert\n");
    }

    public static void printTextPartTwo(){
        System.out.println("\nJava Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));

        // a+3456256245+b    -> najpierw String potem char
        // a+3456256245+b    -> najpierw char potem String

        System.out.println("a" + 10 + 'b');
        System.out.println('a' + 10 + "b");
        System.out.println();

        new String("Adam");
//        "Adam";

        int a = 3423;
        long b = 3423;
        System.out.printf("Maciek waży %d kilogramów", 123);
        double weight = 65.45678d;
        System.out.printf("Maciek chciałby ważyć %f kilogramów\n", weight);
        System.out.printf("%.2f", 3.14159);
    }

    public static void printTextPartThree(){
        System.out.println('A' + 'a');
        System.out.println("Aaa" + "Bbb");
        System.out.println(1 + 2 + 3 + 4);
        System.out.println(1.0 + 2.1 + 3.2);
        System.out.println("Duuuzo cudzyslowiow: \"\"\"\"\"\"");
        System.out.println(true);
        System.out.println(false);
        System.out.println('a' + 'A');
        System.out.println("a" + "A");
        System.out.println(1 + 2);
        System.out.println(1.0 + 2.0);
        System.out.println("cudzysłów \"");
        System.out.println(true);
        System.out.println("\t" + "tekst po tab");
        System.out.println("\n" + "po nowej linii" + "\n" + "tez po nowej linii");
        System.out.println("tekst" + "\r" + "??");
        System.out.println("\'");
        System.out.println("\\");


        System.out.println(2 + 3);
        System.out.println(2 - 4);
        System.out.println(5 / 2);
        System.out.println(5.0 / 2);
        System.out.println(5 / 2.0);
        System.out.println(5.0 / 2.0);
        System.out.println(100L - 10);
        System.out.println(2f - 3);
        System.out.println(5f / 2);
        System.out.println(5d / 2);
        System.out.println('A' + 2);
        System.out.println('a' + 2);
        System.out.println("a" + 2);
        System.out.println("a" + "b");
        System.out.println('a' + 'b');
        System.out.println("a" + 'b');
        System.out.println("a" + 'b' + 3);
        System.out.println('b' + 3 + "a");
        System.out.println(-5 + 8 * 6);
        System.out.println("" + 5 + 8 + 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }

    public static void printTextPartFour(){
        boolean x = false == false;
        System.out.println(x);
        System.out.println(false != true);
        System.out.println(!true);
        System.out.println(2 > 4);
        System.out.println(3 < 5);
        System.out.println(3 == 3 && 3 == 4);
        System.out.println(3 != 5 || 3 == 5);
        System.out.println((2 + 4) > (1 + 3));
        System.out.println("cos" == "cos");
        System.out.println("cos" == new String("cos"));
        System.out.println("cos".equals(new String("cos")));
        System.out.println((2 + 4) > (1 + 3));
    }

}
