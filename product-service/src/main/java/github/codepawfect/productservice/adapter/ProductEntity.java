package github.codepawfect.productservice.adapter;

import github.codepawfect.productservice.domain.Category;
import github.codepawfect.productservice.domain.Product;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "t_product")
public class ProductEntity {
    @Id
    Long id;
    String number;
    String name;
    String description;
    @Enumerated(EnumType.STRING)
    Category category;
    BigDecimal price;

    public static Product mapToDomain(ProductEntity entity) {
        return new Product(
                entity.number,
                entity.name,
                entity.description,
                entity.category,
                entity.price
        );
    }
}
