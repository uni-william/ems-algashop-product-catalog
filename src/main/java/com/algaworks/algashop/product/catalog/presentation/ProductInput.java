package com.algaworks.algashop.product.catalog.presentation;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductInput {

    @NotBlank
    private String name;

    @NotBlank
    private String brand;

    @NonNull
    private BigDecimal regularPrice;

    @NonNull
    private BigDecimal salePrice;

    @NonNull
    private Boolean enabled;

    @NonNull
    private UUID categoryId;

    private String description;
}
