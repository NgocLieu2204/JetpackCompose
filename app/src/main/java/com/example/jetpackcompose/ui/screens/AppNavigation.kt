package com.example.jetpackcompose.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "start") {
        composable("start") { StartScreen(navController) }
        composable("list") { ListScreen(navController) }
        composable("text") { TextScreen(navController) }
        composable("image") { ImageScreen(navController)}
        composable("text_filed") { TextField(navController)}
    }
}