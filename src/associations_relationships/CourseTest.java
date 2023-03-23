package associations_relationships;

public class CourseTest {
    public static void main(String[] args) {
        Student aldi = new Student("Aldi", "Krasniqi");
        Student ylli = new Student("Yll", "Rexhepi");
        Student kosovare = new Student("Kosovare", "Bushati");

        Course oop = new Course("OOP", "Object Oriented Programming");
        Course db = new Course("DB", "Database");

        oop.enrollStudent(aldi);
        oop.enrollStudent(kosovare);
        oop.enrollStudent(ylli);
        oop.enrollStudent(aldi);
        oop.enrollStudent(aldi);

        db.enrollStudent(ylli);

        oop.printStudentList();
        db.printStudentList();

        CourseV2 dsa = new CourseV2("DSA", "Data Structure and Algorithms");
        dsa.enrollStudent(aldi);
        dsa.enrollStudent(aldi);
        dsa.enrollStudent(aldi);
        dsa.enrollStudent(ylli);
        dsa.enrollStudent(kosovare);
        dsa.printStudentList();
    }
}








