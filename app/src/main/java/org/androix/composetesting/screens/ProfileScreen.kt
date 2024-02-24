package org.androix.composetesting.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import org.androix.composetesting.navigation.Screen

object ProfileScreen {

    @Composable
    operator fun invoke(
        navController: NavController
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(painter = rememberVectorPainter(image = Icons.Default.Person), contentDescription = "")
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Person Name")
            Text(text = "Mobile number")
            Button(onClick = { navController.navigate(Screen.HOME.name) }) {
                Text(text = "Navigate to Home")
            }
        }
    }
}