package ushtrimet.enums;

public class NotaTest {
    public static void main(String[] args) {
        Nota notaAldit = Nota.DOBET;
        Nota notaBlendit = Nota.SHUME_MIRE;
        Nota notaProfes = Nota.SHKELQYESHEM;

        System.out.println(notaProfes.getValue() + " -> " + notaProfes.getName());
        System.out.println(notaBlendit.getName());
        System.out.println(notaAldit.getName());
    }
}
