package com.liust.bean;

import java.io.Serializable;

/**
 * @program: Clothes
 * @description:
 * @author: liust
 * @create: 2018-05-24 16:08
 **/
public class Clothes implements Serializable {
    private String id;//商品编号
    private String brand;//品牌
    private String style;//款式
    private String color;//颜色
    private int num;//尺码
    private float price;//库存数量
    private String description;//描述

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
