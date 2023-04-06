package inheritance.bird_app;

public class Parrot extends FlyingBird {
    public Parrot(String call, String color, String food) {
        super(call, color, food);
        System.out.println("Parrot Constructor is called!");
    }

    public Parrot() {
        super(); // e thirre konstruktorin prind
        System.out.println("Parrot Constructor is called!");
    }

    public void test() {
        System.out.println("test");
    }

    @Override
    public String getCall() {
        return " HUHU " + super.getCall();
    }

    @Override
    public String toString() {
        return "I am a Parrot!";
    }
}









