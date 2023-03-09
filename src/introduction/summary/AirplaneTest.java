package introduction.summary;

public class AirplaneTest {
    public static void main(String[] args) {
        Airplane a1 = new Airplane();
        Airplane a2 = new Airplane();

        a1.setShpejtesia(4000);
        a2.setShpejtesia(2500);

        System.out.println(a1.getShpejtesia());
        System.out.println(a2.getShpejtesia());
    }
}
