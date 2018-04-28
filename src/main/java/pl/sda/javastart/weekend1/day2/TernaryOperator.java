package pl.sda.javastart.weekend1.day2;

public class TernaryOperator {

    public static void main(String[] args) {
        System.out.println("Liczba" + 3 + " większa od zera -> "+(numberBiggerThan0(3)?"tak":"nie"));
        System.out.println("Liczba" + -1 + " większa od zera -> "+(numberBiggerThan0(-1)?"tak":"nie"));

    }

    public static boolean numberBiggerThan0(int number) {
        return number > 0;
    }


}
