package com.mymicroservice.mymicroservice.client;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import com.mymicroservice.mymicroservice.model.Category;
import com.mymicroservice.mymicroservice.model.ProductResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class ProductClient
{
    public ProductResponse getProducts()
    {
        WebClient webClient = WebClient.create();
        String PRODUCT_API = "https://dummyjson.com/products";
        return webClient.get()
                .uri(PRODUCT_API)
                .retrieve()
                .bodyToMono(ProductResponse.class)
                .block();
    }

    public List<Category> getCategories() {
        WebClient webClient = WebClient.create();
        String PRODUCT_API = "https://dummyjson.com/products/categories";
        return Arrays.stream(Objects.requireNonNull(
                webClient.get().uri(PRODUCT_API).retrieve().bodyToMono(Category[].class).block())).toList();
    }
}