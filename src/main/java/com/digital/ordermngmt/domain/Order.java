package com.digital.ordermngmt.domain;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.UUID;
@Data
@Builder
public class Order {
    private UUID id;
    private Double latitude;
    private Double longitude;
    private Instant moment;
    private OrderStatus status;
    private Double total;
}
