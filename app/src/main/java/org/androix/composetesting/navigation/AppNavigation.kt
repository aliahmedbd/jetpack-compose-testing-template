package org.androix.composetesting.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import org.androix.composetesting.screens.ErrorScreen
import org.androix.composetesting.screens.MainScreen
import org.androix.composetesting.screens.ProfileScreen
import org.androix.composetesting.screens.SuccessScreen

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
            composable(ScreenRoute.SuccessScreen.screenName) {
                SuccessScreen(navController)
            }
            composable(ScreenRoute.ErrorScreen.screenName) {
                ErrorScreen(navController)
            }
        }
    }
}