package inheritance.summary;

public class WrongStackTest {
    public static void main(String[] args) {
        WrongStack<Integer> stack = new WrongStack<>();
        stack.push(100);
        stack.push(200);
        System.out.println(stack.pop());
    }
}
