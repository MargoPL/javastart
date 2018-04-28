package pl.sda.javastart.weekend1.day1;

import java.time.LocalDateTime;

public class ExNr1 {
    public static void main(String[] args) {
        LocalDateTime czas = LocalDateTime.now();
        int minuta = czas.getMinute();
        int godzina = czas.getHour();
        int rok = czas.getYear();
        int miesiac = czas.getMonthValue();
        int dzien = czas.getDayOfMonth();
        System.out.println("" + godzina + ":" + minuta + " " + dzien + "." + miesiac + "." + rok);

        System.out.println((23 - godzina) * 60 + (60 - minuta) + " minut do północy.");
        System.out.println((((godzina * 60 + minuta) * 100) / (24 * 60)) + "%");
        System.out.println(60 * ((23 - godzina) * 60 + (60 - minuta)) + " sekund do północy.");

        int a = 10;
        int b = 11;
        int c = a;
        a = b;
        b = c;
        System.out.println(""+ a + "\n" + b);



    }
}
