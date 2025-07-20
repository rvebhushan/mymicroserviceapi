package com.mymicroservice.mymicroservice.model;

import java.util.List;

public class ProductResponse
{
    private List<Product> products;

    public List<Product> getProducts()
    {
        return products;
    }

    public void setProducts(final List<Product> products)
    {
        this.products = products;
    }
}
