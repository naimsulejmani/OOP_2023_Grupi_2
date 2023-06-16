package moster_provimi;

public class NenpunesiJoKualifikuar extends NenpunesiDK {

    public NenpunesiJoKualifikuar(int id, String name, String surname, String pozita, boolean statusi,
                                  DataKoha dataKoha) {
        super(id, name, surname, pozita, statusi, dataKoha);
    }

    public void puno() {
        System.out.println("Punoj pa pozite, hamall!");
    }
}
