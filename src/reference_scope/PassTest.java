package reference_scope;

public class PassTest {
    public static void changePrimitive(int value) {
        ++value;
        System.out.println(value);
    }

    public static void changeReference(MyDate from, MyDate to) {
        from = to;
        System.out.println(from);
        System.out.println(to);
    }

    public static void changeObjectDay(MyDate date, int day) {
        date.setDay(day);
    }

    public static void main(String[] args) {
        int value = 100;
        changePrimitive(value);
        System.out.println(value);

        MyDate from = new MyDate(1, 1, 2001);
        MyDate to = new MyDate(2, 2, 2002);
        changeReference(from, to);
        System.out.println(from);
        System.out.println(to);

        changeObjectDay(from, 10);
        changeObjectDay(to, 20);

        System.out.println(from);
        System.out.println(to);

    }
}
