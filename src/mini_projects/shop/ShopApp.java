package mini_projects.shop;

import mini_projects.shop.enums.Rating;
import mini_projects.shop.managers.ProductManager;
import mini_projects.shop.models.Product;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ShopApp {
    public static void main(String[] args) {
//        Product p1 = new Product("Arsenal", "vendi 4",
//                LocalDate.of(2004, 6, 15),
//                BigDecimal.valueOf(300_000_000_000_000L),
//                Rating.FIVE_STAR);
//        System.out.println(p1);

        ProductManager.add("Duhan", "Mos e mbytni vetveten",
                "2023-06-01", -2.40, Rating.ZERO_STAR);
    }
}




