package com.example.pilotflighthourtracker.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pilotflighthourtracker.ui.screen.HomeScreen
import com.example.pilotflighthourtracker.ui.screen.LoginScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.HomeScreen.route, builder = {
        composable(Screen.HomeScreen.route, content = { HomeScreen(navController)})
        composable(Screen.LoginScreen.route, content = { LoginScreen(navController)})
    })

}