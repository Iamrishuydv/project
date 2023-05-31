package com.backend.shopping.shopping;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private Map<Integer, Product> products;

    public ProductService() {
        this.products = new HashMap<>();
        // Add some sample products
        products.put(1, new Product(1, "Lipstik", "Best Product"));
        products.put(2, new Product(2, "Dog", "Loyal"));
    }

    public List<Product> getAllProducts() {
        return new ArrayList<>(products.values());
    }

    public Product getProductById(int id) {
        return products.get(id);
    }

    // Add more methods as needed, e.g., addProduct, updateProduct, deleteProduct, etc.
}
