package pl.sda.javastart.homework;

public class Point {

    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double calculateDistance(Point p2){
        Point p1 = this;
        double distance = Math.sqrt(Math.pow(p1.getX()-p2.getX(),2)+Math.pow(p1.getY()-p2.getY(),2));
        return distance;
    }
}
