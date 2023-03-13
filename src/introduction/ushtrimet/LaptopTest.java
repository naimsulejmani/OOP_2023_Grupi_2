package introduction.ushtrimet;

public class LaptopTest {
    public static void main(String[] args) {
        Laptop model1 = new Laptop("1234567890","asus rog strix","Asus");
        System.out.println(model1);
        model1.setProducer("Lenovo");
        System.out.println(model1);


    }
}
