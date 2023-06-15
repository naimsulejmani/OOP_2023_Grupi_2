package moster_provimi;

public abstract class NenpunesiDK extends Nenpunesi {
    private DataKoha dataKoha;

    public NenpunesiDK(int id, String name, String surname, String pozita,
                       boolean statusi, DataKoha dataKoha) {
        super(id, name, surname, pozita, statusi);
        this.dataKoha = dataKoha;
    }


}
