package inheritance.payroll_app;

public class Employee {
    private final float MIN_SALARY = 264.75f;
    private final int ID;
    private String name;
    private String surname;

    public Employee(int ID, String name, String surname) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
    }

    public int getID() {
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

    public float pay() {
        return MIN_SALARY;
    }

    @Override
    public String toString() {
        return String.format("#%d - %s %s", ID, name, surname); // #1 - Naim Sulejmani
    }
}











