package com.sample.springmodulith.product.internal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Builder
@ToString
@Getter
public class Product {
    private String name;
    private String description;
    private int price;

}
