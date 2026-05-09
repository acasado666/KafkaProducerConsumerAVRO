package com.kodebytes.acasado.dto;

import com.kodebytes.acasado.domain.generated.Flavor;
import com.kodebytes.acasado.domain.generated.Recipient;
import com.kodebytes.acasado.domain.generated.Size;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderLineItemDTO {
    @NotBlank(message = "iceCreamOrder.orderLineItem.name is mandatory")
    private Recipient recipient;

    @NotBlank(message = "iceCreamOrder.orderLineItem.name is mandatory")
    private Flavor falvor;

    @NotNull(message = "iceCreamOrder.orderLineItem.size is mandatory")
    private Size size;

    @NotNull(message = "iceCreamOrder.orderLineItem.size is mandatory")
    private Integer quantity;

    @NotNull
    private BigDecimal cost;
}
