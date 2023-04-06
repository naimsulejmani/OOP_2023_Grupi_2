package inheritance.bird_app;

public class TalkingParrot extends Parrot {
    private String[] words;

    public TalkingParrot(String call, String color, String food, String[] words) {
        super(call, color, food);
        this.words = words;
    }

    public TalkingParrot(String[] words) {
//        super();
        this.words = words;
    }

    public TalkingParrot(String call, String color, String food) {
        super(call, color, food);
    }

    public TalkingParrot() {
    }
}
