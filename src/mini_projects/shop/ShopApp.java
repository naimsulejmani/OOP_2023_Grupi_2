package mini_projects.shop;

import mini_projects.shop.enums.ProductType;
import mini_projects.shop.enums.Rating;
import mini_projects.shop.managers.ProductManager;
import mini_projects.shop.models.Product;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ShopApp {
    public static void main(String[] args) {

        ProductManager.createProduct(ProductType.FOOD, "crosant me coko",
                "shume e shijshme pasi ishte kan hisja e Blendit",
                "2023-04-26", 0.0);

        ProductManager.createProduct(ProductType.DRINK, "Kaffe", "Kaffe pa shiqer",
                "2023-04-27", 0.50);
        ProductManager.createProduct(ProductType.FOOD, "TEST", "TEST",
                "2004-06-01", -3_000_000);

    }
}









