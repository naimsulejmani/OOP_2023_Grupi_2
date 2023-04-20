package exceptions;

public class AddArgument1 {
    public static void main(String[] args) {

        add("1", "five", "2", "3", "4");
    }

    //varargs
    public static void add(String... args) {
        int sum = 0;
        for (String arg : args) {
            try {
                sum += Integer.parseInt(arg);
            } catch (NumberFormatException ex) {
                System.out.printf("%s is not a number!%n", arg);
            }
        }
        System.out.println("Sum: " + sum);
    }
}
