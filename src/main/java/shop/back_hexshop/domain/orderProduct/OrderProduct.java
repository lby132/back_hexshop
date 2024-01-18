package shop.back_hexshop.domain.orderProduct;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import shop.back_hexshop.domain.product.Product;
import shop.back_hexshop.domain.order.Order;

import static jakarta.persistence.FetchType.*;
import static jakarta.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PROTECTED;

@Getter
@Entity
@NoArgsConstructor(access = PROTECTED)
public class OrderProduct {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @ManyToOne(fetch = LAZY)
    private Order order;

    @ManyToOne(fetch = LAZY)
    private Product product;

    private int orderPrice;

    private int cnt;

}
