package ushtrimet;

public class PointTest
{
    public static void main(String[] args) {
        Point p1 = new Point(5,2);
        Point p2 = new Point(6,7);

        System.out.println(p1.distanceTo(p2));
        System.out.println(p2.distanceTo(p1));
        System.out.println(p1.distanceTo(p1));
        System.out.println(p2.distanceTo(p2));

        System.out.println(Point.distanceBetween(p1,p2));
        System.out.println(Point.distanceBetween(p2,p1));
        System.out.println(Point.distanceBetween(p1,p1));






    }
}












