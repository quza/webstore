package sda.webstore.repository;

import sda.webstore.domain.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> getAllProducts();
}