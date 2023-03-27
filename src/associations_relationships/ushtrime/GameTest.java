package associations_relationships.ushtrime;

public class GameTest {
    public static void main(String[] args) {
        Bomber b52 = new Bomber(20.2, 33.3);
        Bomber Mig35 = new Bomber();
        AntiAircraftGun s400 = new AntiAircraftGun();
        AntiAircraftGun ironDome = new AntiAircraftGun(22, 33);

        if (b52.getPosition().distanceTo(s400.getPosition()) < 100)
            b52.setTarget(s400);
        if (s400.getPosition().distanceTo(b52.getPosition()) < 200)
            s400.setTarget(b52);

        ironDome.attack();
        b52.attack();
        s400.attack();
        b52.attack();
        s400.attack();
        b52.attack();
        s400.attack();
    }
}








