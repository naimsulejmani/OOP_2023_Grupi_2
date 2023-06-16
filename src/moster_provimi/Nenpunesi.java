package moster_provimi;

public abstract class Nenpunesi implements Punoj {
    private int id;
    private String emri;
    private String mbiemri;
    private String pozita;
    private boolean statusi;
    private float rroga;

    public Nenpunesi() {
    }

    public Nenpunesi(int id, String emri, String mbiemri, String pozita, boolean statusi) {
        this.id = id;
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.pozita = pozita;
        this.statusi = statusi;
    }

    public float getRroga() {
        return rroga;
    }

    public void setRroga(float rroga) throws RrogaNegativeException {
        if(rroga<0.0f) throw new RrogaNegativeException("Nuk guxon ....");
        this.rroga = rroga;
    }

    public int getId() {
        return id;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String e) {
        emri = e;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String m) {
        mbiemri = m;
    }

    public String getPozita() {
        return pozita;
    }

    public void setPozita(String p) {
        pozita = p;
    }

    public boolean getStatusi() {
        return statusi;

    }

    public void setStatusi(boolean s){
        statusi=s;
    }

    public String toString(){
      return   String.format("%d - %s %s- %s %b ",id,emri,mbiemri,pozita,statusi);
    }

//    public static void main(String[] args) {
//        Nenpunesi n1=new Nenpunesi(1,"Nikolin","Gegaj","Menaxher",true);
//        System.out.println(n1);
//    }

}











