package ushtrimet;

public class SquareTest {
    public static void main(String[] args) {

        Square s1 = new Square(5.4);
        Square s2 = new Square(7.6);

        s1.draw();
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.hasGreaterAreaThan(s2));
        System.out.println(s2.hasGreaterAreaThan(s1));
        System.out.println(s2.hasGreaterAreaThan(s2));

    }
}
