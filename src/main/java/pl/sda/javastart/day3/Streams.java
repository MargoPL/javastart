package pl.sda.javastart.day3;

import java.util.Arrays;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        String[] strings = {"AA", "dd", "bb"};

        Arrays.stream(strings)
                .map(e->e.toUpperCase())
                .forEach(e-> System.out.println(e));

        Arrays.stream(strings)
                .sorted()
                .forEach(e-> System.out.println(e));



    }
}
