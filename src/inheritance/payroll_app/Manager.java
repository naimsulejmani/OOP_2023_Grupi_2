package inheritance.payroll_app;

public class Manager extends SalariedEmployee{
    public Manager(int ID, String name, String surname, float salary, float bonus) {
        super(ID, name, surname, salary, bonus);
    }
    @Override
    public String toString() {
        return String.format(" Titulli: Menaxher %n%s", super.toString());
    }
}
