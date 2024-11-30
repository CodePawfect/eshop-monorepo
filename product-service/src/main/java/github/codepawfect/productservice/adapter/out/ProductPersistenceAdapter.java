package github.codepawfect.productservice.adapter.out;

import github.codepawfect.productservice.adapter.ProductEntity;
import github.codepawfect.productservice.adapter.ProductRepository;
import github.codepawfect.productservice.domain.Category;
import github.codepawfect.productservice.domain.Product;
import github.codepawfect.productservice.domain.out.ProductPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Adapter implementation to persist product related data
 */
@Component
@RequiredArgsConstructor
public class ProductPersistenceAdapter implements ProductPersistencePort {

    private final ProductRepository productRepository;

    /**{@inheritDoc}*/
    @Override
    public Product find(String number) {
        return ProductEntity.mapToDomain(productRepository.findByNumber(number));
    }

    /**{@inheritDoc}*/
    @Override
    public List<Product> findAll(Category category) {
        return productRepository.findAllByCategory(category).stream()
                .map(ProductEntity::mapToDomain)
                .toList();
    }
}
