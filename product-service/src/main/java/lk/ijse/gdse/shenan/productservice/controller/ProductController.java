package lk.ijse.gdse.shenan.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    @GetMapping("all")
    public String getProducts() {
        return "Product Service: Product1, Product2, Product3";
    }
}