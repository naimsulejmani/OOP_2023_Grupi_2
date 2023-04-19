package inheritance.polymorphism_other;

public class BlockTest {
    public static void main(String[] args) {
        Block b1 = new Block(1, 1, 1);
        b1.setWeight(10);
        System.out.println(b1.getWeight());
    }
}
