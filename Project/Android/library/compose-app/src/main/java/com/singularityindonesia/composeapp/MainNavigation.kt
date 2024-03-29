/*
 * Copyright (c) 2024 Stefanus Ayudha (stefanus.ayudha@gmail.com)
 * Created on 04/03/2024 12:00
 * You are not allowed to remove the copyright.
 */
package com.singularityindonesia.composeapp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.singularityindonesia.screen.dashboard.DashboardScreen
import com.singularityindonesia.screen.exampletodolist.ExampleTodoListScreen
import com.singularityindonesia.screen.takepicture.TakePictureScreen


@Composable
fun MainNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "dashboard"
    ) {

        composable(
            route = "dashboard",
        ) {
            val onTakePicture = remember{
                { navController.navigate("takePicture") }
            }
            DashboardScreen(onTakePicture)
        }

        composable(
            route = "takePicture",
        ) {
            TakePictureScreen()
        }
    }
}