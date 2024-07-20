package com.ahargunyllib.hackathon_kotlin_starter.presentation.ui.navigation.nav_host

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ahargunyllib.hackathon_kotlin_starter.presentation.ui.navigation.nav_obj.ParentNavObj
import com.ahargunyllib.hackathon_kotlin_starter.presentation.view.auth.splash_screen.SplashScreen0

@Composable
fun ParentNavHost() {
    val parentNavController = rememberNavController()

    NavHost(
        navController = parentNavController,
        startDestination = ParentNavObj.SplashScreen0.route,
        builder = {
            composable(
                route = ParentNavObj.SplashScreen0.route,
                content = {
                    SplashScreen0()
                },
            )
        },
    )
}