package org.androix.composetesting.navigation

enum class Screen {
    HOME,
    PROFILE
}
sealed class ScreenRoute(val screenName : String) {
    data object HomeScreen : ScreenRoute(Screen.HOME.name)

    data object ProfileScreen : ScreenRoute(Screen.PROFILE.name)
}