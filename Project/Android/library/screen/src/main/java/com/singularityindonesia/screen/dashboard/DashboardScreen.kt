package com.singularityindonesia.screen.dashboard

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun DashboardScreen(
    onTakePictureClick: () -> Unit
) {
    Button(onClick = onTakePictureClick) {
        Text(text = "Take Picture")
    }
}