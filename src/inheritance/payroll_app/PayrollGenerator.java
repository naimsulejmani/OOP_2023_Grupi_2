package inheritance.payroll_app;

import java.util.ArrayList;

public class PayrollGenerator {
    public static void main(String[] args) {
        String fileText =
                "1,Naim,Sulejmani,programmer,2023,3,500,20;" +
                        "2,Nikolin,Gegaj,consulent,2023,3,40,40;" +
                        "3,Dea,Osmanaj,manager,2023,2,1000,10;";

        String[] employeeStrings = fileText.split(";");
        ArrayList<Paycheck> paychecks = new ArrayList<>();

        for (String employeeStr : employeeStrings) {
            String[] employeeAttrs = employeeStr.split(",");
            int id = Integer.parseInt(employeeAttrs[0]);
            String name = employeeAttrs[1];
            String surname = employeeAttrs[2];
            String title = employeeAttrs[3];
            int year = Integer.parseInt(employeeAttrs[4]);
            int month = Integer.parseInt(employeeAttrs[5]);

            float salaryOrHours = Float.parseFloat(employeeAttrs[6]);
            float bonusOrHourlyWage = Float.parseFloat(employeeAttrs[7]);

            Employee employee = switch (title) {
                case "programer" -> new Programmer(id, name, surname, salaryOrHours, bonusOrHourlyWage);
                case "manager" -> new Manager(id, name, surname, salaryOrHours, bonusOrHourlyWage);
                case "consulent" -> new Consulent(id, name, surname, (int) salaryOrHours, bonusOrHourlyWage);
                default -> null;
            };

//            switch (title) {
//                case "programer" -> employee = new Programmer(id, name, surname, salaryOrHours, bonusOrHourlyWage);
//                case "manager" -> employee = new Manager(id, name, surname, salaryOrHours, bonusOrHourlyWage);
//                case "consulent" -> employee = new Consulent(id, name, surname, (int) salaryOrHours, bonusOrHourlyWage);
//                default -> employee = null;
//            }

            if (employee != null) {
                Paycheck paycheck = new Paycheck(month, year, employee);
                paychecks.add(paycheck);
            }
        }

        for (Paycheck paycheck : paychecks) {
            System.out.println(paycheck);
        }
    }
}














