package pl.sda.javastart.weekend1.day1;

import java.math.BigDecimal;

public class BigDecimalExample {

    public static void main(String[] args) {
        double x = 0.02;
        double y = 0.03;
        double z = x - y;

        System.out.println(z);

        BigDecimal a = new BigDecimal("0.02");
        BigDecimal b = new BigDecimal("0.03");
        System.out.println(a.subtract(b));


    }


}
