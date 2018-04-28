package pl.sda.javastart.homework;

public class Square extends Figure {

    Point p1;
    Point p2;
    Point p3;
    Point p4;

    public Square(Point pointOne,Point pointTwo,Point pointThree,Point pointFour){
        this.p1 = pointOne;
        this.p2 = pointTwo;
        this.p3 = pointThree;
        this.p4 = pointFour;

    }
    @Override
    public String toString() {
        return null;
    }

    @Override
    double getArea() {
        return (Math.pow((p1.calculateDistance(p2)),2)) ;
    }

    @Override
    double getCircuit() {
        return 0;
    }

    @Override
    Point[] getVertecies() {
        return new Point[4];
    }
}
