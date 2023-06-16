package moster_provimi;

public class TestMain {
    public static void main(String[] args) {
        Punoj p = new NenpunesiJoKualifikuar(1, "Aldi", "Krasniqi",
                "shites", false, new DataKoha(2000, 2, 2));
        NenpunesiDK p1 = new NenpunesiIKualifikuar(1,
                "Testim", "Testeri", "nenpunes", false,
                new DataKoha(1, 1, 1),
                "programer");
        try {
            p1.setRroga(100);
        } catch (RrogaNegativeException ex) {
            System.out.println("Rroga" + ex.getMessage());
        }
        nisjaPunes(p);
        nisjaPunes(p1);
    }

    static void nisjaPunes(Punoj punoj) {
        punoj.puno();
    }
}
