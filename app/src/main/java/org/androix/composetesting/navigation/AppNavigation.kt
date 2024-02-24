package org.androix.composetesting.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import org.androix.composetesting.screens.MainScreen
import org.androix.composetesting.screens.ProfileScreen

object AppNavigation {
    @Composable
    operator fun invoke(
        navController: NavHostController
    ) {
        NavHost(
            navController = navController,
            startDestination = ScreenRoute.HomeScreen.screenName
        ) {
            composable(ScreenRoute.HomeScreen.screenName) {
                MainScreen(navController)
            }
            composable(ScreenRoute.ProfileScreen.screenName) {
                ProfileScreen(navController)
            }
        }
    }
}