package introduction.summary;

public class Counter {
    private static final int MAX_VALUE = 9999;
    private int value;

    public void increment() {
        if (value < MAX_VALUE)
            ++value;
        else reset();
    }

    public void reset() {
        System.out.println("Value has been reset! BEEP BEEP");
        value = 0;
    }

    public int getValue() {
        return value;
    }


}
