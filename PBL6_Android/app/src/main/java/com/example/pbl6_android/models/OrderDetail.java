package com.example.pbl6_android.models;

import com.google.gson.annotations.SerializedName;

import java.util.UUID;

public class OrderDetail {
    public UUID OrderDetailId ;
    @SerializedName("Quantity")
    public int Quantity ;

    public UUID getOrderDetailId() {
        return OrderDetailId;
    }

    public void setOrderDetailId(UUID orderDetailId) {
        OrderDetailId = orderDetailId;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }




    public OrderDetail(int quantity, UUID productId) {
        Quantity = quantity;
        ProductId = productId;
    }
    @SerializedName("ProductId")
    public UUID ProductId ;
}
