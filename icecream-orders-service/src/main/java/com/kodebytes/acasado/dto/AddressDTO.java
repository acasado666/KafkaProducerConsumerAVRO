package com.kodebytes.acasado.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressDTO {
    @NotBlank(message = "iceCreamOrder.shop.address.addressLine1 is mandatory")
    private String addressLine1;
    @NotBlank(message = "iceCreamOrder.shop.address.city is mandatory")
    private String city;
    @NotBlank(message = "iceCreamOrder.shop.address.country is mandatory")
    private String country;
    @NotBlank(message = "iceCreamOrder.shop.address.zip is mandatory")
    private String zip;
}
