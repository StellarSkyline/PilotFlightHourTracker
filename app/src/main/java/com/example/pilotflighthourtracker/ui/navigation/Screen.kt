package com.example.pilotflighthourtracker.ui.navigation

import androidx.compose.runtime.Composable


sealed class Screen(val route:String) {
    object HomeScreen: Screen("home_screen")
    object LoginScreen: Screen("login_screen")
}