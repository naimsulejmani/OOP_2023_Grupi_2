package introduction.summary;

public class DogTest {
    public static void main(String[] args) {
        Dog lluki = new Dog("Luki", 31, "ball");
        lluki.fetch("lapsin");
        lluki.makeFavourite("ball");
        System.out.println(lluki.getFavouriteToy());
        System.out.println(lluki.getWeight());

        Dog bandit = new Dog("Bandit", 25, "chew");
        bandit.fetch("ball");
    }
}
