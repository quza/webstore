package sda.webstore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sda.webstore.domain.Product;

import java.math.BigDecimal;

@Controller
public class ProductController {

    @RequestMapping("/products")
    public String list(Model model) {
        Product iphone = new Product("P1234", "iPhone 6s", new BigDecimal(500));
        iphone.setDescription("Dobry telefon, jezeli bylby za 3/4 swojej ceny.");
        iphone.setCategory("Smartphone");
        iphone.setManufacturer("Apple");
        iphone.setUnitsInStock(1000);
        model.addAttribute("product", iphone);
        return "products";
    }
}