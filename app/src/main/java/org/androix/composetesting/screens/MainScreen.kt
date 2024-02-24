package org.androix.composetesting.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import org.androix.composetesting.R
import org.androix.composetesting.navigation.Screen
import org.androix.composetesting.ui.theme.JetpackComposeTestingTheme

object MainScreen {
    @Composable
    operator fun invoke(
        navController: NavController
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Button(onClick = { }) {
                Text(text = stringResource(id = R.string.success))
            }

            Button(onClick = { }) {
                Text(text = stringResource(id = R.string.error))
            }

            Button(onClick = {
                navController.navigate(Screen.PROFILE.name)
            }) {
                Text(text = stringResource(id = R.string.navigate_profile))
            }
        }
    }
}

@Preview
@Composable
fun MainScreenPreview() {
    JetpackComposeTestingTheme {
        MainScreen(rememberNavController())
    }
}