package com.example.ecommercespringboot.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@Table(name = "order_items")
public class OrderItems implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private String id = "newid()";

    @Column(name = "order_id", nullable = false)
    private String orderId;

    @Column(name = "product_id", nullable = false)
    private String productId;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "product_sku", nullable = false)
    private String productSku;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "unit_price", nullable = false)
    private BigDecimal unitPrice;

    @Column(name = "total_price", nullable = false)
    private BigDecimal totalPrice;

    @Column(name = "created_at")
    private String createdAt = "getdate()";

}
