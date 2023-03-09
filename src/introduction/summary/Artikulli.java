package introduction.summary;

public class Artikulli {
    private String emri;

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getEmri() {
        if (this.emri == null) {
            return "Artikull i panjohur!";
        }
        return this.emri;
    }
}


