package inheritance;

import associations_relationships.courses.Gender;

import java.time.LocalDate;
import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("Aldi", "Krasniqi",
                LocalDate.of(1947, 12, 1), Gender.MALE, "gjerman",
                1, "2022/23", "kishe programim", "Cacttus"
        );

        Person p1 = new Student("Aldi", "Krasniqi",
                LocalDate.of(1947, 12, 1), Gender.MALE, "gjerman",
                1, "2022/23", "kishe programim", "Cacttus"
        );


        System.out.println(p1.getName());
        System.out.println(p1);


        System.out.println(p1);

        System.out.println(s1.getName());
        System.out.println(s1.getNationality());
        System.out.println(s1.getFieldOfStudy());

        System.out.println(s1);

        StudentTest st = new StudentTest();
        System.out.println(st.toString());

        ArrayList lista = new ArrayList();

    }
}
