package introduction.summary;

public class CounterTest {
    public static void main(String[] args) {
        Counter refugjatet = new Counter();
        for (int i = 0; i < 25000; i++) {
            refugjatet.increment();
        }
        System.out.println(refugjatet.getValue());
//        Counter tespiht = new Counter();
//        tespiht.increment();
//        tespiht.increment();
//        tespiht.increment();
//
//        Counter shitjetDitore = new Counter();
//        shitjetDitore.increment();
//
//        Counter teshtimat = new Counter();
//        teshtimat.increment();
//        teshtimat.increment();
//
//        Counter golatBayern = new Counter();
//        golatBayern.increment();
//        golatBayern.increment();
//
//
//        System.out.println(tespiht.getValue());
//        System.out.println(shitjetDitore.getValue());
//        System.out.println(teshtimat.getValue());
//        System.out.println(golatBayern.getValue());
    }
}
