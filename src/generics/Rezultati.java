package generics;

public class Rezultati implements Comparable<Rezultati> {
    private String name;
    private String surname;
    private float piketNeProvim;

    public Rezultati(String name, String surname, float piketNeProvim) {
        this.name = name;
        this.surname = surname;
        this.piketNeProvim = piketNeProvim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public float getPiketNeProvim() {
        return piketNeProvim;
    }

    public void setPiketNeProvim(float piketNeProvim) {
        this.piketNeProvim = piketNeProvim;
    }

    @Override
    public String toString() {
        return "Rezultati{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", piketNeProvim=" + piketNeProvim +
                '}';
    }

    @Override
    public int compareTo(Rezultati o) {
        if (this.piketNeProvim < o.piketNeProvim) return -1;
        else if (this.piketNeProvim > o.piketNeProvim) return 1;
        return 0;
        //return this.piketNeProvim-o.piketNeProvim;
    }
}
