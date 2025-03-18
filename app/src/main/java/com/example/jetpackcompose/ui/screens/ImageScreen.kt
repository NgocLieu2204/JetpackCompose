package com.example.jetpackcompose.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.jetpackcompose.R

@Composable
fun ImageScreen(navController: NavHostController) {
    Column {
        Header(navHostController = navController, "Image Detail")
        Box(
            modifier = Modifier.padding(10.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.image2),
                contentDescription = "Ảnh từ drawable",
                modifier = Modifier
                    .size(500.dp, 550.dp)
                    .fillMaxWidth()
            )
        }
    }
}


