package introduction.ushtrimet;

public class CinemaTest {
    public static void main(String[] args) {

        Cinema kinoAbc = new Cinema("1", "Kinemaja ABC", "Prishtine",
                "Qafa");
        System.out.println(kinoAbc);
        System.out.println(kinoAbc.isOpen());

    }
}
