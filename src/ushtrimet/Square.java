package ushtrimet;

public class Square {
    private double a = 1;

    public Square(double a) {
        setA(a);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a > 0)
            this.a = a;
        else
            System.out.println("Nuk guxon te jete zero ose me e vogel");
    }

    public double getArea(){
        return a * a;
    }
    public double getPerimeter(){
        return 4 * a;
    }
    public void draw(){
        System.out.println("[]");
    }
    public boolean hasGreaterAreaThan(Square other){
        return a > other.a;
    }



}





