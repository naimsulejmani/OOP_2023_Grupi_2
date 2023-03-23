package associations_relationships;

public class Student {
    private static long generateId = 0;
    private final long ID;
    private String name;
    private String surname;

    public Student(String name, String surname) {
        this.ID = ++generateId;
        this.name = name;
        this.surname = surname;
    }

    public static long getGenerateId() {
        return generateId;
    }

    public static void setGenerateId(long generateId) {
        Student.generateId = generateId;
    }

    public long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format("%d - %s %s", ID, name, surname);
    }
}
