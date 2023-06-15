package moster_provimi;

public class DetyraMetoda {
    public static void plotPjestueshemMeNente() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.printf("%5d", i);
                i = i + 2;
            }
        }
    }

    public static void main(String[] args) {
        plotPjestueshemMeNente();
    }
}
