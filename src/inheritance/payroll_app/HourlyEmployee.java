package inheritance.payroll_app;

public class HourlyEmployee extends Employee {
    private int hours;
    private float hourlyWage;

    public HourlyEmployee(int ID, String name, String surname, int hours, float hourlyWage) {
        super(ID, name, surname);
        this.hours = hours;
        this.hourlyWage = hourlyWage;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public float getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(float hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    @Override
    public float pay() {
        return hours * hourlyWage;
    }

    @Override
    public String toString() {
        return String.format(" Per: %s%n Oret:  %20d %n Cmimi:  %20.2f EUR %n Totali: %20.2f EUR",
                super.toString(), hours, hourlyWage, pay());
    }
}




