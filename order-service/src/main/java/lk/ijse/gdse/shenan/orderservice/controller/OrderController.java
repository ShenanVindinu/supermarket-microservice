package lk.ijse.gdse.shenan.orderservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    public String getOrders() {
        return "Order Service: Order1, Order2, Order3";
    }
}
