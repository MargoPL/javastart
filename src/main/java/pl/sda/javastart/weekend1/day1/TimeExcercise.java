package pl.sda.javastart.weekend1.day1;

import java.time.LocalDateTime;

public class TimeExcercise {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();
        int hour = now.getHour();
        int minute = now.getMinute();

        String monthValue = month < 10 ? "0" + month : "" + month;

        System.out.println(hour + ":" + minute + " " + day + "." +
                monthValue + "." + year);

        System.out.println("Od północy minęło: " + ((hour * 60) + minute) + " minut.");
        System.out.println("Minęło " + ((hour * 60) + minute) * 100 / (24 * 60) + " procent doby");


        int secondsInDay = 24 * 60 * 60;
        int hoursToSubtract = hour * 60 * 60;
        int minutesToSubstract = minute * 60;
        System.out.println("Do końca dobry pozostało "
                + (secondsInDay - hoursToSubtract - minutesToSubstract));
    }
}
