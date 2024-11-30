package github.codepawfect.productservice.adapter.in;

import github.codepawfect.productservice.domain.Category;
import github.codepawfect.productservice.domain.Product;
import github.codepawfect.productservice.domain.in.GetProductUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Responsible to handle incoming requests for product related data
 */
@RestController()
@RequiredArgsConstructor
public class ProductController {

    private final GetProductUseCase getProductUseCase;

    @GetMapping("/product/{number}")
    public ResponseEntity<Product> getProduct(@PathVariable("number") String productNumber) {
        return ResponseEntity.ok(getProductUseCase.getByProductNumber(productNumber));
    }

    @GetMapping("/product")
    public ResponseEntity<List<Product>> getProductsByCategory(@RequestParam String category) {
        return ResponseEntity.ok(getProductUseCase.getAllByCategory(Category.valueOf(category.toUpperCase())));
    }
}
