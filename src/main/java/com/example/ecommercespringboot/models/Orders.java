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
@Table(name = "orders")
public class Orders implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private String id = "newid()";

    @Column(name = "order_number", nullable = false)
    private String orderNumber;

    @Column(name = "user_id", nullable = false)
    private String userId;

    @Column(name = "status", nullable = false)
    private String status = "PENDING";

    @Column(name = "total_amount", nullable = false)
    private BigDecimal totalAmount;

    @Column(name = "subtotal", nullable = false)
    private BigDecimal subtotal;

    @Column(name = "tax_amount")
    private BigDecimal taxAmount = BigDecimal.ZERO;

    @Column(name = "shipping_amount")
    private BigDecimal shippingAmount = BigDecimal.ZERO;

    @Column(name = "discount_amount")
    private BigDecimal discountAmount = BigDecimal.ZERO;

    @Column(name = "payment_status")
    private String paymentStatus = "PENDING";

    @Column(name = "payment_method")
    private String paymentMethod;

    @Column(name = "shipping_address_id")
    private String shippingAddressId;

    @Column(name = "billing_address_id")
    private String billingAddressId;

    @Column(name = "notes")
    private String notes;

    @Column(name = "shipped_at")
    private String shippedAt;

    @Column(name = "delivered_at")
    private String deliveredAt;

    @Column(name = "created_at")
    private String createdAt = "getdate()";

    @Column(name = "updated_at")
    private String updatedAt = "getdate()";

}
