package inheritance.bird_app;

public class WalkingBird extends Bird {
    public WalkingBird(String call, String color, String food) {
        super(call, color, food, Movement.WALKED);
        System.out.println("Walking Constructor is called!");
    }
}










