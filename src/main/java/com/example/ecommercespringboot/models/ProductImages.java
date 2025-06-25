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

@Entity
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@Table(name = "product_images")
public class ProductImages implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private String id = "newid()";

    @Column(name = "product_id", nullable = false)
    private String productId;

    @Column(name = "image_url", nullable = false)
    private String imageUrl;

    @Column(name = "alt_text")
    private String altText;

    @Column(name = "is_primary")
    private Boolean primary = Boolean.FALSE;

    @Column(name = "sort_order")
    private Integer sortOrder = 0;

    @Column(name = "created_at")
    private String createdAt = "getdate()";

}
