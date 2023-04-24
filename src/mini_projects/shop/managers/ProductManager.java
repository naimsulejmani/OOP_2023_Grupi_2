package mini_projects.shop.managers;

import mini_projects.shop.enums.Rating;
import mini_projects.shop.exceptions.ProductExpiredException;
import mini_projects.shop.exceptions.ProductInvalidPriceException;
import mini_projects.shop.models.Product;
import mini_projects.shop.repositories.ProductRepository;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProductManager {
    private static final ProductRepository repository = new ProductRepository();

    public static void add(String name, String description, String bestBefore, double price, Rating rating) {
        Product p = new Product(name, description, LocalDate.parse(bestBefore),
                BigDecimal.valueOf(price), rating);

        try {
            repository.add(p);
            System.out.println("Produkti u regjistrua me sukses!");
        } catch (ProductInvalidPriceException e) {
            System.out.println("Cmimi negative: " + e.getPrice());
        } catch (ProductExpiredException e) {
            System.out.println("Ka skadu afati per me regjistru kete produkt me: " + e.getExpiredDate());
        }
    }
}
