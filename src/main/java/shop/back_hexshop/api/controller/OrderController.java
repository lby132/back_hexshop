package shop.back_hexshop.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import shop.back_hexshop.api.service.OrderService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class OrderController {

    @Autowired
    private final OrderService orderService;

    //@GetMapping("/getOrderList")
//    public Map<String, Object> getOrders() {
//        List<OrderDto> orderList = orderService.getOrderList();
//
//        Map<String, Object> result = new HashMap<>();
//
//        if (ListUtils.isEmpty(orderList)) {
//            result.put("result", "상품을 등록해주세요.");
//        } else {
//            result.put("result", "OK");
//            result.put("orderList", orderList);
//        }
//
//        return result;
//    }
}
