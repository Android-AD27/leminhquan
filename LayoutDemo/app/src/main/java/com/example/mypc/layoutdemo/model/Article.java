package com.example.mypc.layoutdemo.model;

import com.example.mypc.layoutdemo.R;

import java.util.Date;

/**
 * Created by leminhquan on 23/05/2017.
 */

public class Article {
    int articleId;
    int articleThumb;
    int brandId;
    String price;
    String title;
    int statusTag;
    int madeInTag;
    int locationTag;
    Date registerDate;

    public Article(int articleId, int articleThumb, int brandId, String price, String title, int statusTag, int madeInTag, int locationTag, Date registerDate) {
        this.articleId = articleId;
        this.articleThumb = articleThumb;
        this.brandId = brandId;
        this.price = price;
        this.title = title;
        this.statusTag = statusTag;
        this.madeInTag = madeInTag;
        this.locationTag = locationTag;
        this.registerDate = registerDate;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStatusTag() {
        return statusTag;
    }

    public void setStatusTag(int statusTag) {
        this.statusTag = statusTag;
    }

    public int getMadeInTag() {
        return madeInTag;
    }

    public void setMadeInTag(int madeInTag) {
        this.madeInTag = madeInTag;
    }

    public int getLocationTag() {
        return locationTag;
    }

    public void setLocationTag(int locationTag) {
        this.locationTag = locationTag;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public int getArticleThumb() {
        return articleThumb;
    }

    public void setArticleThumb(int articleThumb) {
        this.articleThumb = articleThumb;
    }

}
