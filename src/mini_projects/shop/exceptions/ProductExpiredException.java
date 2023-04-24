package mini_projects.shop.exceptions;

import java.time.LocalDate;

public class ProductExpiredException extends Exception {
    private LocalDate expiredDate;

    public ProductExpiredException(LocalDate expiredDate) {
        this.expiredDate = expiredDate;
    }

    public ProductExpiredException(String message, LocalDate expiredDate) {
        super(message);
        this.expiredDate = expiredDate;
    }

    public ProductExpiredException() {
        this.expiredDate = LocalDate.now();
    }

    public ProductExpiredException(String message) {
        super(message);
        this.expiredDate = LocalDate.now();
    }

    public LocalDate getExpiredDate() {
        return expiredDate;
    }
}
