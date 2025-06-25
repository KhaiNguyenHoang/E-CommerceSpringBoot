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
@Table(name = "products")
public class Products implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private String id = "newid()";

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "short_description")
    private String shortDescription;

    @Column(name = "sku", nullable = false)
    private String sku;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @Column(name = "discount_price")
    private BigDecimal discountPrice;

    @Column(name = "category_id", nullable = false)
    private String categoryId;

    @Column(name = "brand")
    private String brand;

    @Column(name = "weight")
    private BigDecimal weight;

    @Column(name = "dimensions")
    private String dimensions;

    @Column(name = "stock_quantity")
    private Integer stockQuantity = 0;

    @Column(name = "min_stock_level")
    private Integer minStockLevel = 5;

    @Column(name = "is_active")
    private Boolean active = Boolean.TRUE;

    @Column(name = "is_featured")
    private Boolean featured = Boolean.FALSE;

    @Column(name = "rating")
    private BigDecimal rating = BigDecimal.ZERO;

    @Column(name = "review_count")
    private Integer reviewCount = 0;

    @Column(name = "meta_title")
    private String metaTitle;

    @Column(name = "meta_description")
    private String metaDescription;

    @Column(name = "created_at")
    private String createdAt = "getdate()";

    @Column(name = "updated_at")
    private String updatedAt = "getdate()";

}
