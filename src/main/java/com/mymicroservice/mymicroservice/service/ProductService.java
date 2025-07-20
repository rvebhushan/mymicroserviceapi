package com.mymicroservice.mymicroservice.service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import com.mymicroservice.mymicroservice.client.ProductClient;
import com.mymicroservice.mymicroservice.model.Category;
import com.mymicroservice.mymicroservice.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService
{
    @Autowired
    private ProductClient productClient;

    public List<Product> getProducts() {
        return CompletableFuture.supplyAsync(this::getProduct).thenApplyAsync(this::getCategory).join().stream().toList();
    }

    private List<Product> getProduct()
    {
        return productClient.getProducts().getProducts();
    }

    private List<Product> getCategory(List<Product> products)
    {
        Map<String, String> categoryMap = productClient.getCategories().stream().collect(Collectors.toMap(Category::getSlug, Category::getUrl));
        products.forEach(p -> categoryMap.computeIfPresent(p.getCategory(), (k, v) -> {p.setCategoryUrl(v); return v;}));

        return products;
    }
}