package com.example.pbl6_android.retrofit;

import com.example.pbl6_android.models.Order;
import com.example.pbl6_android.models.Product;
import com.example.pbl6_android.models.Promotion;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface RetrofitInterface {
    @GET("/Cart/getAllProduct")
    Call<List<Product>> getAllProduct(@Query("page") int page, @Query("size") int size);

    @GET("/Cart/getAllPromotion")
    Call<List<Promotion>> getAllPromotion(@Query("page") int page, @Query("size") int size);
    @POST("/Cart/checkout")
    Call<ResponseBody> checkout(@Query("payment") String paymentMethod, @Body Order order);
}
