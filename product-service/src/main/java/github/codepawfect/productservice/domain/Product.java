package github.codepawfect.productservice.domain;

import java.math.BigDecimal;

public record Product(
        String number,
        String name,
        String description,
        Category category,
        BigDecimal price
){}
