package inheritance.polymorphism_other;

public class Dell24GammingMonitor extends Monitor {
    private int hz;
    private boolean moveUpDown;

    public Dell24GammingMonitor(int hz, boolean moveUpDown) {
        this.hz = hz;
        this.moveUpDown = moveUpDown;
    }

    public int getHz() {
        return hz;
    }

    public boolean isMoveUpDown() {
        return moveUpDown;
    }
}
