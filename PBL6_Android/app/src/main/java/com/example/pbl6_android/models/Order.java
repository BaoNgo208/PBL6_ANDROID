package com.example.pbl6_android.models;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;
public class Order {
    private UUID OrderId;


    private LocalDateTime OrderDate;
    @SerializedName("TotalAmount")
    private int totalAmount; // Use BigDecimal for precise amount

    public Order(String status, List<OrderDetail> orderDetails) {
        Status = status;
        OrderDetails = orderDetails;
    }

    public UUID getOrderId() {
        return OrderId;
    }

    public void setOrderId(UUID orderId) {
        OrderId = orderId;
    }

    public LocalDateTime getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        OrderDate = orderDate;
    }



    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<OrderDetail> getOrderDetails() {
        return OrderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        OrderDetails = orderDetails;
    }
    @SerializedName("Status")
    private String Status;
    private User user;

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Order(UUID orderId, LocalDateTime orderDate, int totalAmount, String status, User user, List<OrderDetail> orderDetails) {
        OrderId = orderId;
        OrderDate = orderDate;
        this.totalAmount = totalAmount;
        Status = status;
        this.user = user;
        OrderDetails = orderDetails;
    }

    public Order(UUID orderId, LocalDateTime orderDate, float totalAmount, String status, User user, List<OrderDetail> orderDetails) {
        OrderId = orderId;
        OrderDate = orderDate;

        Status = status;
        this.user = user;
        OrderDetails = orderDetails;
    }
    @SerializedName("OrderDetails")
    private List<OrderDetail> OrderDetails;
}
