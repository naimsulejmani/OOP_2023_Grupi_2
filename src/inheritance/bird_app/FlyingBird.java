package inheritance.bird_app;

public class FlyingBird extends Bird {
    public FlyingBird(String call, String color, String food) {
        super(call, color, food, Movement.FLEW);
        System.out.println("FlyingBird Constructor is called!");
    }
    public FlyingBird() {
        super(null, null, null, Movement.FLEW);
        System.out.println("FlyingBird Constructor is called!");
    }
}
