package inheritance.payroll_app;

public class SalariedEmployee extends Employee {
    private float salary;
    private float bonus;

    public SalariedEmployee(int ID, String name, String surname, float salary, float bonus) {
        super(ID, name, surname);
        this.salary = salary;
        this.bonus = bonus;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public float pay() {
        return salary + salary * bonus / 100;
    }

    @Override
    public String toString() {
        return String.format(" Per: %s%n Paga:  %20.2f EUR%n Bonusi: %20.2f %% %n Totali: %20.2f EUR",
                super.toString(), salary, bonus, pay());
    }
}







