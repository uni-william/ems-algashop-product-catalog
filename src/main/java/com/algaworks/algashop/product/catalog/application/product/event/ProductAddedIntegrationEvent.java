package com.algaworks.algashop.product.catalog.application.product.event;

import com.algaworks.algashop.product.catalog.application.IntegrationEvent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductAddedIntegrationEvent implements IntegrationEvent {

    private UUID productId;
    private OffsetDateTime addedAt;

    @Override
    public String getAggregateId() {
        if (productId == null) {
            return null;
        }
        return productId.toString();
    }
}