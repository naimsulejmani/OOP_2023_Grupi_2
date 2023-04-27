package mini_projects.shop.models;

import mini_projects.shop.enums.Rating;

import java.math.BigDecimal;
import java.time.LocalDate;

public final class Food extends Product {
    public Food(String name, String description, LocalDate bestBefore, BigDecimal price, Rating rating) {
        super(name, description, bestBefore, price, rating);
    }

    public Food(String name, String description) {
        super(name, description);
    }

    public Food(String name, String description, LocalDate bestBefore, BigDecimal price) {
        super(name, description, bestBefore, price);
    }


    @Override
    public double getDiscount() {
        LocalDate lastWeek = LocalDate.now().plusWeeks(-1);
        return getBestBefore().isAfter(lastWeek) && getBestBefore().isBefore(LocalDate.now())
                ? 0.50 : 0.0;
    }
}








