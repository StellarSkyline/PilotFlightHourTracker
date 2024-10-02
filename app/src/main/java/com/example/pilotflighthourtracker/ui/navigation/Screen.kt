package com.example.pilotflighthourtracker.ui.navigation

import androidx.compose.runtime.Composable


sealed class Screen(val route:String) {
    data object HomeScreen: Screen("home_screen")
    data object LoginScreen: Screen("login_screen")
}