package com.mj_eno.sidedish.domain.dish;

import org.springframework.data.annotation.Id;

public class Dish {

    @Id
    Long id;
    String hash;
    String alt;
    String title;
    String description;
    int nPrice;
    int sPrice;
    int point;
    int stock;
    String deliveryType;
    String deliveryInfo;
    String deliveryFee;
    int menuCategoryId;
    int bestMenuCategoryId;

    public Long getId() {
        return id;
    }

    public String getHash() {
        return hash;
    }

    public String getAlt() {
        return alt;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getnPrice() {
        return nPrice;
    }

    public int getsPrice() {
        return sPrice;
    }

    public int getPoint() {
        return point;
    }

    public int getStock() {
        return stock;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public String getDeliveryInfo() {
        return deliveryInfo;
    }

    public String getDeliveryFee() {
        return deliveryFee;
    }

    public int getMenuCategoryId() {
        return menuCategoryId;
    }

    public int getBestMenuCategoryId() {
        return bestMenuCategoryId;
    }
}