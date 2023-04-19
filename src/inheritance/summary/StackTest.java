package inheritance.summary;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(200);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }
}
