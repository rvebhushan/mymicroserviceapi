package com.mymicroservice.mymicroservice.model;

import java.util.List;

public class Product
{
    private int id;
    private String title;
    private String description;
    private double price;
    private double discountPercentage;
    private double rating;
    private int stock;
    private String brand;
    private String category;
    private String thumbnail;
    private List<String> images;
    private String categoryUrl;

    public int getId()
    {
        return id;
    }

    public void setId(final int id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(final String title)
    {
        this.title = title;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(final String description)
    {
        this.description = description;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(final double price)
    {
        this.price = price;
    }

    public double getDiscountPercentage()
    {
        return discountPercentage;
    }

    public void setDiscountPercentage(final double discountPercentage)
    {
        this.discountPercentage = discountPercentage;
    }

    public double getRating()
    {
        return rating;
    }

    public void setRating(final double rating)
    {
        this.rating = rating;
    }

    public int getStock()
    {
        return stock;
    }

    public void setStock(final int stock)
    {
        this.stock = stock;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(final String brand)
    {
        this.brand = brand;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(final String category)
    {
        this.category = category;
    }

    public String getThumbnail()
    {
        return thumbnail;
    }

    public void setThumbnail(final String thumbnail)
    {
        this.thumbnail = thumbnail;
    }

    public List<String> getImages()
    {
        return images;
    }

    public void setImages(final List<String> images)
    {
        this.images = images;
    }

    public String getCategoryUrl()
    {
        return categoryUrl;
    }

    public void setCategoryUrl(final String categoryUrl)
    {
        this.categoryUrl = categoryUrl;
    }
}