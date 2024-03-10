package org.androix.composetesting.navigation

enum class Screen {
    HOME,
    PROFILE,
    SUCCESS_SCREEN,
    ERROR_SCREEN
}
sealed class ScreenRoute(val screenName : String) {
    data object HomeScreen : ScreenRoute(Screen.HOME.name)

    data object ProfileScreen : ScreenRoute(Screen.PROFILE.name)

    data object SuccessScreen : ScreenRoute(Screen.SUCCESS_SCREEN.name)

    data object ErrorScreen : ScreenRoute(Screen.ERROR_SCREEN.name)
}