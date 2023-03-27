package associations_relationships.ushtrime;

import ushtrimet.Point;

public class Bomber {
    private AntiAircraftGun target;
    private Point position;
    private int health = 100;

    public Bomber(double positionX, double positionY) {
        this.position = new Point(positionX, positionY);
    }

    public Bomber() {
        this.position = new Point(Math.random() * 100, Math.random() * 100);
    }

    public AntiAircraftGun getTarget() {
        return target;
    }

    public void setTarget(AntiAircraftGun target) {
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
                    System.out.println("KAPUT ANTI_AIRCRAFT!");
                }
            } else {
                System.out.println("Pshtova");
            }
        } else {
            System.out.println("Nuk keni target!");
        }
    }


}





