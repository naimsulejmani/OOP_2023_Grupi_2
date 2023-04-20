package exceptions;

public class AddArgument {
    public static void main(String[] args) {
        add("1", "five", "2", "3", "4");
    }

    //varargs
    public static void add(String... args) {
        try {
            int sum = 0;
            for (String arg : args) {
                sum += Integer.parseInt(arg);
            }
            System.out.println("Sum: " + sum);
        } catch (NumberFormatException ex) {
            System.out.println("Eshte dhene nje argument i cili nuk eshte numer!");
            System.out.println(ex.getMessage());
        }
    }
}
