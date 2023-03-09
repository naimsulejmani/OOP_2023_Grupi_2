package introduction.summary;

public class ArtikulliTest {
    public static void main(String[] args) {
        Artikulli a1 = new Artikulli();
        Artikulli a2 = new Artikulli();
        Artikulli a3 = new Artikulli();

        a1.setEmri("Monte Choko");
        a2.setEmri("Sempre!");
        a3 = a2;
        a3.setEmri("Jogobella");
        a3 = new Artikulli();

        System.out.println(a1.getEmri() + " Shume e shijshme!");
        System.out.println(a2.getEmri() + " jo edhe aq!");
        System.out.println(a3.getEmri() + " sharing is caring, and sharing is fun!");

    }
}





