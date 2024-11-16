package com.securebank.ui.screens

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.securebank.viewmodel.UserViewModel

@Composable
fun HomeScreen(
    userViewModel: UserViewModel = viewModel()
) {
    // Observe the user state from ViewModel
    val user by userViewModel.user

    // State to hold if loading is in progress
    var isLoading by remember { mutableStateOf(true) }

    // Load user data (for example, by calling userViewModel.loadUser(userId))
    LaunchedEffect(Unit) {
        userViewModel.loadUser("user_id_example")
        isLoading = false
    }

    // Screen Layout
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Home") },
                backgroundColor = MaterialTheme.colors.primary
            )
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                if (isLoading) {
                    CircularProgressIndicator()
                } else {
                    user?.let {
                        Text("Welcome ${it.name}", style = MaterialTheme.typography.h5)
                        Text("Balance: \$${it.balance}", style = MaterialTheme.typography.h6)
                    } ?: run {
                        Text("User not found")
                    }
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}
