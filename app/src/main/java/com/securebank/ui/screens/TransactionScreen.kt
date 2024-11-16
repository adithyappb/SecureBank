package com.securebank.ui.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.securebank.network.Transaction

@Composable
fun TransactionScreen(transactions: List<Transaction>) {
    LazyColumn {
        items(transactions.size) { index ->
            Text(text = transactions[index].description)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TransactionScreenPreview() {
    TransactionScreen(transactions = listOf(
        Transaction("Grocery Store", -50.0),
        Transaction("Salary", 1500.0)
    ))
}
