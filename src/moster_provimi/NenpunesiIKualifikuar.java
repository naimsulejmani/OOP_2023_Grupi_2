package moster_provimi;

public class NenpunesiIKualifikuar extends NenpunesiDK {
    private String kualifikimet;

    public NenpunesiIKualifikuar(int id, String name, String surname, String pozita, boolean statusi,
                                 DataKoha dataKoha, String kualifikimet) {
        super(id, name, surname, pozita, statusi, dataKoha);
        this.kualifikimet = kualifikimet;
    }
    // get set

    public void puno() {
        System.out.println("Punoj si " + kualifikimet);
    }

    public static void main(String[] args) {
        Punoj p = new NenpunesiIKualifikuar(1, "Aldi", "A",
                "programer",
                true, new DataKoha(2000, 1, 1), "gjaja");
        System.out.println(p);
        p.puno();
    }
}
