package introduction.summary;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Product {
    private BigDecimal price;
    private LocalDate createdAt = LocalDate.now();

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = BigDecimal.valueOf(price);
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }
}











