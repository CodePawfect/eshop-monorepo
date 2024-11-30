package github.codepawfect.productservice.domain.out;

import github.codepawfect.productservice.domain.Category;
import github.codepawfect.productservice.domain.Product;

import java.util.List;

/**
 * Provides methods to persist product related data in any persistence storage
 */
public interface ProductPersistencePort {

    /**
     * Find a {@link Product} by its product number
     * @param number identifies the product by its product number
     * @return {@link Product}
     */
    Product find(String number);

    /**
     * Find a list of {@link Product} by product category
     * @param category identifies products by category
     * @return list of {@link Product}
     */
    List<Product> findAll(Category category);
}
