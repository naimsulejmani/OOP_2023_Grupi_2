package associations_relationships.ushtrime;

import ushtrimet.Point;

public class AntiAircraftGun {
    private Bomber target;
    private Point position;
    private int health = 100;

    public AntiAircraftGun(double positionX, double positionY) {
        this.position = new Point(positionX, positionY);
    }

    public AntiAircraftGun() {
        this.position = new Point(Math.random() * 100, Math.random() * 100);
    }

    public Bomber getTarget() {
        return target;
    }

    public void setTarget(Bomber target) {
        this.target = target;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void attack() {
        if (target != null) {
            if (Math.random() < 0.5) {
                int damage = (int) (Math.random() * 101);
                target.setHealth(target.getHealth() - damage);
                if (target.getHealth() <= 0) {
                    System.out.println("KAPUT BOMBER!");
                }
            } else {
                System.out.println("Pshtova");
            }
        } else {
            System.out.println("Nuk keni target!");
        }
    }
}
