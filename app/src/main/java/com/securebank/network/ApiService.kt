package com.securebank.network

import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("user/{userId}")
    suspend fun getUser(@Path("userId") userId: String): User

    @GET("transactions")
    suspend fun getTransactions(): List<Transaction>
}
