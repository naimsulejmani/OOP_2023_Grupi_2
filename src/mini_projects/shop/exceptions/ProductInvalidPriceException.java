package mini_projects.shop.exceptions;

public class ProductInvalidPriceException extends Exception {
    private double price;

    public ProductInvalidPriceException(double price) {
        this.price = price;
    }

    public ProductInvalidPriceException(String message, double price) {
        super(message);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
