package associations_relationships;

import java.util.ArrayList;

public class CourseV2 {
    private final String ID;
    private String name;
    private static final int MAX_STUDENTS = 100;
    private ArrayList<Student> enrolledStudents;

    public CourseV2(String ID, String name) {
        this.ID = ID;
        this.name = name;
        enrolledStudents = new ArrayList<>();
    }
/*
    if (student == null) return;
    if (enrolledStudents.size() >= MAX_STUDENTS) return;
    if (enrolledStudents.contains(student)) return
 */
    public void enrollStudent(Student student) {
        if (student != null) {
            if (enrolledStudents.size() < MAX_STUDENTS) {
                if (!enrolledStudents.contains(student))
                    enrolledStudents.add(student);
                else
                    System.out.println("Students already is registered!!!");
            } else {
                System.out.println("Nuk ka vende te lira!");
            }
        }
    }

    public void printStudentList() {
        System.out.printf("Ne kursin %s-%s jane regjistuaru gjithsej: %d studenta!%n",
                ID, name, enrolledStudents.size());
        System.out.println("Vende te lira: " + (MAX_STUDENTS - enrolledStudents.size()));
        if (enrolledStudents.size() > 0) {
            System.out.println("Lista e studentave: ");
            System.out.println("---------------------------------");
            for (Student student : enrolledStudents) {
                if (student != null)
                    System.out.println(student);
            }
            System.out.println("---------------------------------");
        }
    }
}












