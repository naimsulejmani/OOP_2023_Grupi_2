package generics;

public class PairTwo<T, U> {
    private T first;
    private U second;

    public PairTwo(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "PairTwo{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
