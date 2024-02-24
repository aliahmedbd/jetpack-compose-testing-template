package org.androix.composetesting

enum class Screen {
    HOME,
    PROFILE
}
sealed class ScreenRoute(val screenName : String) {
    class HomeScreen : ScreenRoute(Screen.HOME.name)

    class ProfileScreen : ScreenRoute(Screen.PROFILE.name)
}