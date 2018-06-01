package com.liust.bean;

import com.liust.utils.OrderStatusType;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Clothes
 * @description:
 * @author: liust
 * @create: 2018-05-24 16:13
 **/
public class Order {
    private int orderId;
    private List<OrderItem> orderItems=new ArrayList<>();
    private  String createDate;
    private float sum;
    private OrderStatusType statusType=OrderStatusType.UNPAID;//状态
    private int userId;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    public OrderStatusType getStatusType() {
        return statusType;
    }

    public void setStatusType(OrderStatusType statusType) {
        this.statusType = statusType;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
