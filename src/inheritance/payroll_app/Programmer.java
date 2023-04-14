package inheritance.payroll_app;

public class Programmer extends SalariedEmployee {
    public Programmer(int ID, String name, String surname, float salary, float bonus) {
        super(ID, name, surname, salary, bonus);
    }

    @Override
    public String toString() {
        return String.format(" Titulli: Programer %n%s", super.toString());
    }
}
