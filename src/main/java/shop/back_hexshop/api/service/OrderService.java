package shop.back_hexshop.api.service;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.back_hexshop.domain.order.Order;

public interface OrderService extends JpaRepository<Order, Long> {
}
