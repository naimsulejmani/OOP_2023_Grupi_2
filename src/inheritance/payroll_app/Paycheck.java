package inheritance.payroll_app;

import java.time.LocalDate;

public class Paycheck {
    private static int generatorId = 0;
    private final int id;
    private int month;
    private int year;
    private Employee employee;
    private LocalDate createdAt;

    public Paycheck(int month, int year, Employee employee) {
        id = ++generatorId;
        this.month = month;
        this.year = year;
        this.employee = employee;
        createdAt = LocalDate.now();
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        String result = "-------------------------------\n";
        result += String.format("#%d - Payslip for period %d/%d%n", id, month, year);
        result += "-------------------------------\n";
        result += employee + "\n";
        result += "-------------------------------\n";
        result += "Shtypur me:         " + createdAt;
        result += "\n-------------------------------\n";
        return result;
    }
}









