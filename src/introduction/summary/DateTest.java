package introduction.summary;

public class DateTest {
    public static void main(String[] args) {
        Date d1 = new Date(9,5,2023);
//        d1.setDay(9);
//        d1.setMonth(5);
//        d1.setYear(2023);

        System.out.println(d1.toString());

        Date d2 = new Date(100,100,10000);
//        d2.setYear(1223132);
//        d2.setMonth(13);
//        d2.setDay(-1);
        System.out.println(d2.toString());
    }
}
