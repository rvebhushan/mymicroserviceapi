package com.mymicroservice.mymicroservice.model;

public class Category {
    private String slug;
    private String name;
    private String url;

    public String getSlug()
    {
        return slug;
    }

    public void setSlug(final String slug)
    {
        this.slug = slug;
    }

    public String getName()
    {
        return name;
    }

    public void setName(final String name)
    {
        this.name = name;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(final String url)
    {
        this.url = url;
    }
}