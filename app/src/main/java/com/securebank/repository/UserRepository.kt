package com.securebank.repository

import com.securebank.network.User
import com.securebank.network.ApiService
import javax.inject.Inject

class UserRepository @Inject constructor(
    private val apiService: ApiService
) {

    suspend fun getUser(userId: String): User {
        // Simulate an API call, replace this with actual network logic
        return apiService.getUser(userId)
    }
}