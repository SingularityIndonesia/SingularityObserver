package com.singularityindonesia.screen.takepicture

import android.util.Log
import androidx.compose.runtime.Composable
import com.singularityindonesia.camera.CameraView
import java.util.concurrent.Executors

@Composable
fun TakePictureScreen() {
    CameraView(
        executor = Executors.newSingleThreadExecutor(),
        onImageCaptured = { uri ->
            Log.d("aldsnal", "DashboardScreen: onImageCaptured: $uri")
        },
        onError = { e ->

        }
    )
}