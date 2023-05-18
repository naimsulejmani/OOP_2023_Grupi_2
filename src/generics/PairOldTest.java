package generics;

public class PairOldTest {
    public static void main(String[] args) {
        PairInt pI = new PairInt(1, 0);
        PairDouble pD = new PairDouble(10.2, 1.1);
        PairObject pO = new PairObject(10, 22);

        int nr = (int) pO.getFirst();
    }
}
