package com.kodebytes.acasado.dto;

import com.kodebytes.acasado.domain.generated.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class IceCreamOrderUpdateDTO {
    private OrderStatus orderStatus;
}