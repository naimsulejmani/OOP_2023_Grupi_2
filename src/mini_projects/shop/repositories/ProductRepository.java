package mini_projects.shop.repositories;

import mini_projects.shop.exceptions.ProductExpiredException;
import mini_projects.shop.exceptions.ProductInvalidPriceException;
import mini_projects.shop.exceptions.ProductNotFoundException;
import mini_projects.shop.models.Product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class ProductRepository {
    //kjo klase mundeson DML + DQL (CRUD) ne burimin e te dhanve
    // per momentin po i ruajme ne memorie nepermjet listes, DB, FILE, ...
    private ArrayList<Product> products = new ArrayList<>();

    public void add(Product product) throws ProductInvalidPriceException, ProductExpiredException {
        if (product.getPrice().compareTo(BigDecimal.ZERO) < 0)
            throw new ProductInvalidPriceException(product.getPrice().doubleValue());
        if (product.getBestBefore().isBefore(LocalDate.now()))
            throw new ProductExpiredException(product.getBestBefore());
        products.add(product);
    }

    public Product findById(int productId) throws ProductNotFoundException {
        for (Product product : products) {
            if (product.getId() == productId)
                return product;
        }
        throw new ProductNotFoundException(
                String.format("Produkti me id={%d} nuk u gjet!", productId));
    }

    public void deleteById(int productId) throws ProductNotFoundException {
        Product product = findById(productId);
        products.remove(product);
    }

    public void update(int productId, Product updatedProduct) throws ProductNotFoundException {
        Product product = findById(productId);
        product.setName(updatedProduct.getName());
        product.setDescription(updatedProduct.getDescription());
        product.setPrice(updatedProduct.getPrice());
        product.setBestBefore(updatedProduct.getBestBefore());
        product.setRating(updatedProduct.getRating());
    }
    public ArrayList<Product> findAll() {
        return (ArrayList<Product>) products.clone(); // return products;
    }

}












