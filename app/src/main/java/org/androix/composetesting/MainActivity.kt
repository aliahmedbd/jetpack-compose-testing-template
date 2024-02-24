package org.androix.composetesting

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.BottomNavigation
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import org.androix.composetesting.navigation.AppNavigation
import org.androix.composetesting.navigation.BottomNavigationBar
import org.androix.composetesting.navigation.Screen
import org.androix.composetesting.navigation.ScreenRoute
import org.androix.composetesting.ui.theme.JetpackComposeTestingTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTestingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    val screen = listOf(
                        ScreenRoute.HomeScreen.screenName,
                        ScreenRoute.ProfileScreen.screenName
                    )
                    val showBottomBar =
                        navController.currentBackStackEntryAsState().value?.destination?.route in screen.map { it }
                    Scaffold(
                        bottomBar = {
                            AnimatedVisibility(
                                visible = showBottomBar,
                                enter = fadeIn() + scaleIn(),
                                exit = fadeOut() + scaleOut()
                            ) {
                                Row(
                                    horizontalArrangement = Arrangement.SpaceEvenly,
                                    modifier = Modifier
                                        .background(MaterialTheme.colorScheme.background)
                                        .fillMaxWidth()
                                ) {
                                    BottomNavigation {
                                        BottomNavigationBar(
                                            items = listOf(
                                                BottomNavigationBar.BottomNavItem(
                                                    name = ScreenRoute.HomeScreen.screenName,
                                                    route = Screen.HOME.name,
                                                    icon = rememberVectorPainter(image =Icons.Default.Home)
                                                ),
                                                BottomNavigationBar.BottomNavItem(
                                                    name = ScreenRoute.ProfileScreen.screenName,
                                                    route = Screen.PROFILE.name,
                                                    icon = rememberVectorPainter(image =Icons.Default.Person)
                                                )
                                            ),
                                            navController = navController,
                                            onItemClick = {
                                                navController.navigate(it.route)
                                            }
                                        )
                                    }
                                }
                            }
                        }
                    ) {
                        AppNavigation(navController = navController)
                    }
                }
            }
        }
    }
}
