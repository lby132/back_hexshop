package shop.back_hexshop.domain.product;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import shop.back_hexshop.domain.BaseEntity;

import static jakarta.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PROTECTED;

@Getter
@Entity
@NoArgsConstructor(access = PROTECTED)
public class Product extends BaseEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private int productNumber;

    @Enumerated(EnumType.STRING)
    private ProductType productType;

    private String productName;

    private int price;

    private String productDescription;

    private int productQuantity;
}
