package github.codepawfect.productservice.domain.in;

import github.codepawfect.productservice.domain.Category;
import github.codepawfect.productservice.domain.Product;

import java.util.List;

/**
 * Provides methods to get product related data
 */
public interface GetProductUseCase {
    /**
     * Get {@link Product} by product number
     * @param number identifies the product by its product number
     * @return {@link Product}
     */
    Product getByProductNumber(String number);

    /**
     * Get a List of {@link Product} by product category
     * @param category identifies the product category
     * @return List of {@link Product}
     */
    List<Product> getAllByCategory(Category category);
}
