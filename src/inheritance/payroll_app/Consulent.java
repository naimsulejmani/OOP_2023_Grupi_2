package inheritance.payroll_app;

public class Consulent extends HourlyEmployee{
    public Consulent(int ID, String name, String surname, int hours, float hourlyWage) {
        super(ID, name, surname, hours, hourlyWage);
    }
    @Override
    public String toString() {
        return String.format(" Titulli: Keshilltar %n%s", super.toString());
    }
}
