package com.example.jetpackcompose.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jetpackcompose.R


@Composable
fun StartScreen(navController: NavController){
    Column {
        Box(
            modifier = Modifier.padding(50.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.image1),
                contentDescription = "Ảnh từ drawable",
                modifier = Modifier
                    .size(300.dp, 350.dp)
            )
        }

        Text(
            text = "Jetpack Compose",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )

        Text(
            text = "Jetpack Compose is a modern UI toolkit for building native Android applications using a declarative programming approach.",
            fontSize = 20.sp,
            color = Color.Gray,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(25.dp)
        )

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            Button(
            onClick = { navController.navigate("list") },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF42AFFF),
                contentColor = Color.White
            ),
            modifier = Modifier
                .padding(bottom = 40.dp)
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .padding(start = 25.dp, end = 25.dp, bottom = 20.dp)
                .height(50.dp)
        ) {
            Text(
                text = "I'm Ready",
                fontSize = 20.sp
                )
            }
        }
    }
}
