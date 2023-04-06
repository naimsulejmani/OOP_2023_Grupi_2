package inheritance.bird_app;

public class Goose extends WalkingBird {
    public Goose(String call, String color, String food) {
        super(call, color, food);
        System.out.println("Goose Constructor is called!");
    }

    @Override
    public String getCall() {
        return "five little goose says " + super.getCall();
    }

    @Override
    public String toString() {
        return "I am a Goose!";
    }
}
