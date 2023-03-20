package ushtrimet;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

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

    public double distanceTo(Point other) {
        double xDiff = other.x - this.x;
        double yDiff = other.y - this.y;

        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public static double distanceBetween(Point p1, Point p2) {
        double xDiff = p2.x - p1.x;
        double yDiff = p2.y - p1.y;

        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }


    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


}
