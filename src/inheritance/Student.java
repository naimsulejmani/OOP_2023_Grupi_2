package inheritance;

import associations_relationships.courses.Gender;

import java.time.LocalDate;

public class Student extends Person {
    private int id;
    private String generation;
    private String fieldOfStudy;
    private String college;

    public Student(String name, String surname, LocalDate birthdate, Gender gender,
                   String nationality, int id, String generation,
                   String fieldOfStudy, String college) {
        super(name, surname, birthdate, gender, nationality);
        this.id = id;
        this.generation = generation;
        this.fieldOfStudy = fieldOfStudy;
        this.college = college;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public String getName() {
        return "Stud => " + super.getName();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", generation='" + generation + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", college='" + college + '\'' +
                '}' + " -> " + super.toString();
    }
}
