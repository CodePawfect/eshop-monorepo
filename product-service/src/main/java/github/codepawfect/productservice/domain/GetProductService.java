package github.codepawfect.productservice.domain;

import github.codepawfect.productservice.domain.in.GetProductUseCase;
import github.codepawfect.productservice.domain.out.ProductPersistencePort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Domain service responsible for handling product related use cases
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class GetProductService implements GetProductUseCase {

    private final ProductPersistencePort productPersistencePort;

    /**{@inheritDoc}*/
    @Override
    public Product getByProductNumber(String number) {
        return productPersistencePort.find(number);
    }

    /**{@inheritDoc}*/
    @Override
    public List<Product> getAllByCategory(Category category) {
        return productPersistencePort.findAll(category);
    }
}
