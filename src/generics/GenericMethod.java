package generics;

public class GenericMethod {
    public static void main(String[] args) {
//        double middleD = getMiddle(10.2, 11.2, 22.2);
//        int middleI = getMiddle(1, 2, 3, 5, 6, 7, 8, 9);
//        String middleS = getMiddle("Naim", "Filan", "Fistek", "A", "B");
//        System.out.println(middleD);
//        System.out.println(middleI);
//        System.out.println(middleS);

        System.out.println(min(1, 2, 3, 4));
        System.out.println(min(9.9, 1.1, 2.2));
        System.out.println(min("Filan", "Albin", "Alba", "B"));

        Rezultati erblinR = new Rezultati("Erblin", "Zulfaj", 77);
        Rezultati eraR = new Rezultati("Era", "Gashi", 44);
        Rezultati bleronR = new Rezultati("Bleron", "Ukehaxhaj", 49);
        Rezultati minRezultati = min(erblinR, eraR, bleronR);
        System.out.println("MIN = " + minRezultati);
    }

    public static <T> T getMiddle(T... args) {
        return args[args.length / 2];
    }

    public static <T extends Comparable<T>> T min(T... args) {
        if (args.length == 0) throw new IllegalArgumentException("No paramteres!");
        T minValue = args[0];

        for (int i = 1; i < args.length; i++) {
            if (args[i].compareTo(minValue) < 0) {
                minValue = args[i];
            }
        }
        return minValue;
    }
}







