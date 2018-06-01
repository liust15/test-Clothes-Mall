package com.liust.bean;

/**
 * @program: Clothes
 * @description:
 * @author: liust
 * @create: 2018-05-24 16:13
 **/
public class OrderItem {
    private int itemId;
    private Clothes clothes;//商品
    private int shoppingNum;
    private float sum;//购买金额

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    public int getShoppingNum() {
        return shoppingNum;
    }

    public void setShoppingNum(int shoppingNum) {
        this.shoppingNum = shoppingNum;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }


}
