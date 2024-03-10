package org.androix.composetesting

import androidx.activity.ComponentActivity
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.navigation.compose.ComposeNavigator
import androidx.navigation.testing.TestNavHostController
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.androix.composetesting.screens.MainScreen
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainScreenTest {

    private lateinit var navController: TestNavHostController

    @get:Rule
    val composeRule = createAndroidComposeRule<ComponentActivity>()

    @Before
    fun setupAppNavHost() {
        composeRule.setContent {
            navController = TestNavHostController(LocalContext.current)
            navController.navigatorProvider.addNavigator(ComposeNavigator())
            MainScreen(navController)
        }
    }

    @Test
    fun mainScreenContentTest() {
        composeRule.onNodeWithText("Success Screen").assertIsDisplayed()
        composeRule.onNodeWithText("Error Screen").assertIsDisplayed()
        composeRule.onNodeWithText("Navigate to profile").assertIsDisplayed()
    }
}