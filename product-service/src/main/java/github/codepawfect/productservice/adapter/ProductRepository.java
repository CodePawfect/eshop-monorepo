package github.codepawfect.productservice.adapter;

import github.codepawfect.productservice.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<ProductEntity, Long> {
    ProductEntity findByNumber(String number);
    List<ProductEntity> findAllByCategory(Category category);
}
