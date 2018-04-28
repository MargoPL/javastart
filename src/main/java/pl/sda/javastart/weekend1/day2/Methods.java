package pl.sda.javastart.weekend1.day2;

public class Methods {

    public static void main(String[] args) {
        sleepIn(true, true);
        varargsExample(123, 123,"asd","asd");
    }
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }

        return false;
    }
    public static double calculateRectangeArea(double a, double b) {
        return a * b;
    }

    public static double calculateRectangeCirc(double a, double b) {
        return 2 * a + 2 * b;
    }

    public static double bmi(double weight, double height) {
        return weight / Math.pow(height, 2);
    }

    public static void varargsExample(int x, int y, String... values) {

    }

}
