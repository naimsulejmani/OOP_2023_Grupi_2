package ushtrimet;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(3.5);
        Circle c2 = new Circle(-5.9);

        System.out.println(c1.getDiameter());
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
    }
}
