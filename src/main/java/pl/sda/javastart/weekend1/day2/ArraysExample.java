package pl.sda.javastart.weekend1.day2;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExample {
    public static void main(String[] args) {
//        printNamesWithComma();
//        printArray(5, 3);
//        printArray(5, 13);
        sumElementsOfArray(new int[]{1, 2, 3});
    }


    private static void printNamesWithComma() {
        Scanner cin = new Scanner(System.in);

        String[] names = new String[5];

        int i = 0;
        do {
            System.out.println("Podaj kolejne imię: ");
            String name = cin.nextLine();
            names[i] = name;
            i++;
        } while (i < 5);
        int a = 0;
        for (String name : names) {
            System.out.print(name + (a < names.length - 1 ? ", " : ""));
            a++;
        }
    }

    public static void printArray(int arraysSize, int elements) {
        int[] arrays = new int[arraysSize < elements ? elements : arraysSize];


        for (int i = 0; i < elements; i++) {
            arrays[i] = 7;


        }
        for (int array : arrays) {
            System.out.println(array);
        }
    }

    public static void sumElementsOfArray(int[] array) {
        int sumOfArrayElements = 0;

//        for (int i=0; i<array.length;i++) {
//            sumOfArrayElements += array[i];
//        }

        for (int element : array) {
            sumOfArrayElements += element;
        }
        System.out.println(sumOfArrayElements);

        int sum = Arrays.stream(array).sum();
        System.out.println(sum);

    }

    public boolean comperArrays(int[] arraysOne, int[] arraysSecond) {

        //{4,2,3} {4,2,3}

//        for (int i = 0; i < arraysSecond.length; i++) {
//            if(arraysOne[i] != arraysSecond[i]){
//                return false;
//            }
//        }
//        return true;

        int iterator = 0;
        for (int numberValue : arraysOne) {
            if (numberValue != arraysSecond[iterator]) {
                return false;
            }
            iterator++;
        }
        return true;
    }


}

