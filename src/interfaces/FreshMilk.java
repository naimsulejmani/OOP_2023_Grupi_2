package interfaces;

public class FreshMilk implements Perishable {
    @Override
    public void perish() {

    }

    @Override
    public boolean isPerished() {
        return false;
    }

    public void test() {
        System.out.println("TEST");
    }
}
