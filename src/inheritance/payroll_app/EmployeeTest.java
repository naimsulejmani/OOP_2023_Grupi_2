package inheritance.payroll_app;

public class EmployeeTest {
    public static void main(String[] args) {
        SalariedEmployee s1 = new SalariedEmployee(1, "Filan", "Fisteku", 500, 10);
        System.out.println(s1);

        System.out.println("--------------------------------------");
        HourlyEmployee h1 = new HourlyEmployee(2, "Orges", "Dreshaj", 90, 50);
        System.out.println(h1);

        Paycheck check = new Paycheck(3, 2023, h1);
        check.print();
    }
}
