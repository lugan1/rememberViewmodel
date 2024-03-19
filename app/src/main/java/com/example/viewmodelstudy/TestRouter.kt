package com.example.viewmodelstudy

import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController

@Composable
fun TestRouter() {
    val navController = rememberNavController()
    NavHost(
        modifier = Modifier.background(Color.White),
        navController = navController, startDestination = "start"
    ) {
        composable("start") {
            StartScreen(
                navigateToRoot = {
                    navController.navigate("home")
                }
            )
        }

        navigation(
            route = "home",
            startDestination = "home"
        ) {
            composable("home") { backStackEntry ->
                val parentEntry = remember(backStackEntry) { navController.getBackStackEntry("root") }
                AScreen(
                    viewModel = hiltViewModel<AViewModel>(parentEntry),
                    navigateToB = {
                        navController.navigate("profile")
                    }
                )
            }

            composable("profile") { backStackEntry ->
                val parentEntry = remember(backStackEntry) { navController.getBackStackEntry("root") }
                BScreen(
                    viewModel = hiltViewModel<BViewModel>(parentEntry),
                    navigateToA = {
                        navController.navigate("home")
                    },
                    navigateToStart = {
                        navController.navigate("start")
                    }
                )
            }
        }
    }
}