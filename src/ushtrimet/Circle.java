package ushtrimet;

public class Circle {
    private double radius = 1;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter(){
        return 2 * radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public void setRadius(double radius) {
        if (radius > 0)
            this.radius = radius;
        else
            System.out.println("Nuk guxon te jete rrezja 0 ose me e vogel");

    }
}






















