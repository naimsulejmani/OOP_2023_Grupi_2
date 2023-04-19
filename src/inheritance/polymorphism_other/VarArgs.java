package inheritance.polymorphism_other;

public class VarArgs {
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(1));
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1, 49, -123, 123, 123, 5324, 123, 321, -12345, 23));

        byte a = 10;
        byte b = 20;
        System.out.println(multiply(a, b));
    }

    public static int multiply(byte a, byte b) {
        return a * b;
    }
    public static int multiply(byte a, int b) {
        return a * b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int sum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}










