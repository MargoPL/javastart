package pl.sda.javastart.homework;

public class HomeworkMain {
    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(2,0);
        Point p3 = new Point(2,2);
        Point p4 = new Point(0,2);

        Square square = new Square(p1,p2,p3,p4);
        System.out.println(square.getArea());
    }
}
