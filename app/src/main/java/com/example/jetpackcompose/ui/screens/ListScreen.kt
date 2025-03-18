package com.example.jetpackcompose.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun ListScreen(navController: NavController){
    Column {
        Text(
            text = "UI Components List",
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            color = Color(0xFF42AFFF),
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp)
                .padding(15.dp)
        )

        Text(
            text = "Display",
            textAlign = TextAlign.Left,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(start = 8.dp)
                .padding(top = 25.dp)
        )

        Button(onClick = {navController.navigate("text") },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF42AFFF),
                    contentColor = Color.Black
                ),
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 30.dp, top = 5.dp, bottom = 0.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth()
                ) {
                Text(
                    text = "Text",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(top = 5.dp)
                )

                Text(
                    text = "Display Text",
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(bottom = 5.dp)
                )
            }
        }

        Button(onClick = {navController.navigate("image") },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF42AFFF),
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 30.dp, top = 10.dp, bottom = 0.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Image",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(top = 5.dp)
                )

                Text(
                    text = "Display Image",
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(bottom = 5.dp)
                )
            }
        }

        Text(
            text = "Input",
            textAlign = TextAlign.Left,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(start = 8.dp, top = 30.dp)
        )

        Button(onClick = {navController.navigate("text_field") },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF42AFFF),
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 30.dp, top = 5.dp, bottom = 0.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "TextField",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(top = 5.dp)
                )

                Text(
                    text = "Input for Textfield",
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(bottom = 5.dp)
                )
            }
        }

        Button(onClick = { },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF42AFFF),
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 30.dp, top = 10.dp, bottom = 0.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "PasswordField",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 5.dp)
                )

                Text(
                    text = "Input for passwords",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
            }
        }

        Text(
            text = "Layout",
            textAlign = TextAlign.Left,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.padding(start = 8.dp, top = 30.dp)
        )

        Button(onClick = { },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF42AFFF),
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 30.dp, top = 5.dp, bottom = 0.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Column",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 5.dp)
                )

                Text(
                    text = "Arranges elements vertically",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
            }
        }

        Button(onClick = { },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF42AFFF),
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 30.dp, top = 10.dp, bottom = 0.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Row",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(top = 5.dp)
                )

                Text(
                    text = "Arranges elements horizontally",
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(bottom = 5.dp)
                )
            }
        }

    }
}
