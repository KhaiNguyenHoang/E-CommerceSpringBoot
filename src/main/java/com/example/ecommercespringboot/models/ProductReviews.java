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

@Entity
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@Table(name = "product_reviews")
public class ProductReviews implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private String id = "newid()";

    @Column(name = "product_id", nullable = false)
    private String productId;

    @Column(name = "user_id", nullable = false)
    private String userId;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "rating", nullable = false)
    private Integer rating;

    @Column(name = "title")
    private String title;

    @Column(name = "comment")
    private String comment;

    @Column(name = "is_verified")
    private Boolean verified = Boolean.FALSE;

    @Column(name = "is_approved")
    private Boolean approved = Boolean.FALSE;

    @Column(name = "created_at")
    private String createdAt = "getdate()";

    @Column(name = "updated_at")
    private String updatedAt = "getdate()";

}
