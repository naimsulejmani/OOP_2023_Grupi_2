package associations_relationships;

import java.time.LocalDate;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1);
        p1.setBirthdate(null);
        System.out.println(p1);
        p1.setBirthdate(LocalDate.now().minusDays(278));
        System.out.println(p1);
        p1 = null;
    }
}







