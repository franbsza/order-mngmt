package com.digital.ordermngmt.domain;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class Product {
    private UUID id;
    private String name;
    private Double price;
    private String description;
    private String imageUri;
}
