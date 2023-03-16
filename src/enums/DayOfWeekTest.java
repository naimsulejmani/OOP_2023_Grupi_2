package enums;

public class DayOfWeekTest {
    public static void main(String[] args) {
        DayOfWeek today = DayOfWeek.THURSDAY;
        DayOfWeek tomorrow = DayOfWeek.FRIDAY;


        System.out.println(today);
        System.out.println(tomorrow);

        System.out.println(today == DayOfWeek.SATURDAY);
        System.out.println(today == DayOfWeek.THURSDAY);
        System.out.println(today != tomorrow);
        System.out.println(today.compareTo(tomorrow));
        System.out.println(today.compareTo(DayOfWeek.SUNDAY));
        System.out.println(today.ordinal());
        System.out.println(tomorrow.ordinal());

    }
}







