package inheritance.polymorphism_other;

public class Monitor {
    private float inch;

    public Monitor(float inch) {
        this.inch = inch;
    }

    public Monitor() {
        this(24f);
    }

    public float getInch() {
        return inch;
    }
}








