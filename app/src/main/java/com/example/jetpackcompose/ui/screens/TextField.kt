package com.example.jetpackcompose.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun TextField(navController: NavHostController) {
    Column(
        modifier = Modifier.background(Color.White)
    ) {
        Header(navHostController = navController, "TextField Detail")
        var text by remember { mutableStateOf("") }
        TextField(
            value = text,
            onValueChange = {text = it},
            label = { Text("Enter text") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
        )
    }
}
