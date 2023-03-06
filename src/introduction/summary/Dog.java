package introduction.summary;

public class Dog {
    //variablat instance, attirbutet, data member
    private String name;
    private float weight;
    private String favouriteToy;


    //konstruktori
    public Dog(String name, float weight, String favouriteToy) {
        this.name = name;
        this.weight = weight;
        this.favouriteToy = favouriteToy;
    }


    //metodat, operations, behaviours, sjelljet -> folje

    public void fetch(String toy) {
        System.out.printf("%s dog is fetching the toy %s! %n", name, toy);
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public void makeFavourite(String toy) {
        favouriteToy = toy;
    }

    public String getFavouriteToy() {
        return favouriteToy;
    }

    //DOG me perdore valueOf logic
}








