package com.securebank.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.securebank.repository.UserRepository
import com.securebank.network.User
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(
    private val userRepository: UserRepository
) : ViewModel() {

    // Expose the user data as a state
    private val _user = mutableStateOf<User?>(null)
    val user: State<User?> = _user

    // Function to load user data
    fun loadUser(userId: String) {
        viewModelScope.launch {
            // Fetch the user data from repository
            val fetchedUser = userRepository.getUser(userId)
            
            // Update the UI state with the fetched data
            _user.value = fetchedUser
        }
    }
}
