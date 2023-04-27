package mini_projects.shop.models;

import mini_projects.shop.enums.Rating;

import java.math.BigDecimal;
import java.time.LocalDate;

public final class Drink extends Product {
    public Drink(String name, String description, LocalDate bestBefore, BigDecimal price, Rating rating) {
        super(name, description, bestBefore, price, rating);
    }

    public Drink(String name, String description) {
        super(name, description);
    }

    public Drink(String name, String description, LocalDate bestBefore, BigDecimal price) {
        super(name, description, bestBefore, price);
    }

    @Override
    public double getDiscount() {
        return getBestBefore().isEqual(LocalDate.now()) ? 0.80 : 0.0;
    }
}










