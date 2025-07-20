package com.mymicroservice.mymicroservice.model;

import java.util.List;

public class CategoryResponse
{
    private List<Category> category;

    public List<Category> getCategory()
    {
        return category;
    }

    public void setCategory(final List<Category> category)
    {
        this.category = category;
    }
}
