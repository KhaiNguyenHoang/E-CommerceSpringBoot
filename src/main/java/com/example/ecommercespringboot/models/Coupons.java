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

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@Table(name = "coupons")
public class Coupons implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private String id = "newid()";

    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "value", nullable = false)
    private BigDecimal value;

    @Column(name = "minimum_amount")
    private BigDecimal minimumAmount = BigDecimal.ZERO;

    @Column(name = "maximum_discount")
    private BigDecimal maximumDiscount;

    @Column(name = "usage_limit")
    private Integer usageLimit;

    @Column(name = "used_count")
    private Integer usedCount = 0;

    @Column(name = "is_active")
    private Boolean active = Boolean.TRUE;

    @Column(name = "starts_at")
    private String startsAt;

    @Column(name = "expires_at")
    private String expiresAt;

    @Column(name = "created_at")
    private String createdAt = "getdate()";

}
