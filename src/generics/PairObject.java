package generics;

public class PairObject {
    private Object first;
    private Object second;

    public PairObject(Object first, Object second) {
        this.first = first;
        this.second = second;
    }

    public Object getFirst() {
        return first;
    }

    public void setFirst(Object first) {
        this.first = first;
    }

    public Object getSecond() {
        return second;
    }

    public void setSecond(Object second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "PairObject{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
