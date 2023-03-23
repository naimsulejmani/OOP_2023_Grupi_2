package associations_relationships;

public class Course {
    private final String ID;
    private String name;
    private static final int MAX_STUDENTS = 100;
    private Student[] enrolledStudents;
    private int numStudents = 0;

    public Course(String ID, String name) {
        this.ID = ID;
        this.name = name;
        this.enrolledStudents = new Student[MAX_STUDENTS];
    }

    public void enrollStudent(Student student) {
        if (student != null) {
            if (numStudents < MAX_STUDENTS) {
                enrolledStudents[numStudents++] = student;
            } else {
                System.out.println("Nuk ka vende te lira!");
            }
        }
    }

    public void printStudentList() {
        System.out.printf("Ne kursin %s-%s jane regjistuaru gjithsej: %d studenta!%n",
                ID, name, numStudents);
        System.out.println("Vende te lira: " + (MAX_STUDENTS - numStudents));
        if (numStudents > 0) {
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






