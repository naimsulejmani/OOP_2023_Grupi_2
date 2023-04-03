package records;

public class PersonTest {
    public static void main(String[] args) {
        PersonRecord p1 = new PersonRecord("Naim",20);
        System.out.println(p1);
        System.out.println(p1.name());
    }
}
