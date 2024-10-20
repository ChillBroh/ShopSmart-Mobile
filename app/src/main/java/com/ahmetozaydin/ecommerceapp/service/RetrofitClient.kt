package com.ahmetozaydin.ecommerceapp.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "https://webapi-fc6r.onrender.com/api"

    val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val productsAPI: ProductsAPI = retrofit.create(ProductsAPI::class.java)
}
