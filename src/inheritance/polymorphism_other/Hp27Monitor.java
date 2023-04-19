package inheritance.polymorphism_other;

public class Hp27Monitor extends Monitor {
    public boolean curved;

    public Hp27Monitor(boolean curved) {
        super(27f);
        this.curved = curved;
    }

    public boolean isCurved() {
        return curved;
    }
}
