package introduction.summary;

public class ProductTest {
    public static void main(String[] args) {
        Product monteChoko = new Product();
        monteChoko.setPrice(0.75);
        System.out.println(monteChoko.getPrice());
        System.out.println(monteChoko.getCreatedAt());

        Product veturaBmvX1 = new Product();
        System.out.println(veturaBmvX1.getPrice());
    }
}
