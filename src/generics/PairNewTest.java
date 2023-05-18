package generics;

public class PairNewTest {
    public static void main(String[] args) {
        PairOne<Integer> pI = new PairOne<>(10, 20);
        PairOne<Double> pD = new PairOne<>(20.2, 30.2);
        PairOne<String> pS = new PairOne<>("A", "B");

        System.out.println(pD.getFirst());
        System.out.println(pI.getFirst());




        PairTwo<Integer, Integer> pairOfInts = new PairTwo<>(20, 30);
        PairTwo<Integer, String> pairIntWithString = new PairTwo<>(1, "Naim");

        int nr = pairIntWithString.getFirst();

        System.out.println(pairIntWithString.getFirst());
        System.out.println(pairIntWithString.getSecond());


    }
}





