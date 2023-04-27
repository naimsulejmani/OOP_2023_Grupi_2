package mini_projects.shop.managers;

import mini_projects.shop.enums.ProductType;
import mini_projects.shop.enums.Rating;
import mini_projects.shop.exceptions.ProductExpiredException;
import mini_projects.shop.exceptions.ProductInvalidPriceException;
import mini_projects.shop.exceptions.ProductNotFoundException;
import mini_projects.shop.models.Drink;
import mini_projects.shop.models.Food;
import mini_projects.shop.models.Product;
import mini_projects.shop.models.Review;
import mini_projects.shop.repositories.ProductRepository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class ProductManager {
    private static final ProductRepository repository = new ProductRepository();

    public static void createProduct(ProductType type, String name,
                                     String description, String bestBefore, double price) {

        Product product = switch (type) {
            case FOOD -> new Food(name, description, LocalDate.parse(bestBefore), BigDecimal.valueOf(price));
            case DRINK -> new Drink(name, description, LocalDate.parse(bestBefore), BigDecimal.valueOf(price));
        };
        try {
            repository.add(product);
            System.out.println("Produkti u regjistrua me sukses!");
        } catch (ProductInvalidPriceException e) {
            System.out.println("Cmimi negative: " + e.getPrice());
            System.out.println("Gabim ne produktin: " + name);
        } catch (ProductExpiredException e) {
            System.out.println("Ka skadu afati per me regjistru kete produkt me: " + e.getExpiredDate());
            System.out.println("Gabim ne produktin: " + name);
        }
    }

    public static void createReview(int productId, String username, String comment, boolean anonymous,
                                    int stars) {
        try {
            Product product = repository.findById(productId);
            Review review = new Review(username, comment, Rating.values()[stars], anonymous);
            product.getReviews().add(review);
        } catch (ProductNotFoundException e) {
            System.out.println("Produkti nuk u gjet per me i be review! ProductID = " + productId);
        }
    }

    public static void printAllProducts(boolean showReviews) {
        ArrayList<Product> products = repository.findAll();
        System.out.println("-------------------------------");
        System.out.println("Total products: " + products.size());
        System.out.println("-------------------------------");
        for (Product product : products) {
            System.out.println(product);
            System.out.println();
            if (showReviews)
                printReviewFor(product);
        }
        System.out.println("-------------------------------");
    }

    private static void printReviewFor(Product product) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Lista e reviews:");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (Review review : product.getReviews()) {
            System.out.println(review);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Total reviews: " + product.getReviews().size());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }


}











