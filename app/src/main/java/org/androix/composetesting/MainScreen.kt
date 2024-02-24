package org.androix.composetesting

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
import org.androix.composetesting.ui.theme.JetpackComposeTestingTheme

object MainScreen {
    @Composable
    operator fun invoke() {
        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {

            Button(onClick = {  }) {
                Text(text = stringResource(id = R.string.success))
            }

            Button(onClick = {  }) {
                Text(text = stringResource(id = R.string.error))
            }

            Button(onClick = {  }) {
                Text(text = stringResource(id = R.string.navigate_profile))
            }
        }
    }
}

@Preview
@Composable
fun MainScreenPreview() {
    JetpackComposeTestingTheme {
        MainScreen()
    }
}