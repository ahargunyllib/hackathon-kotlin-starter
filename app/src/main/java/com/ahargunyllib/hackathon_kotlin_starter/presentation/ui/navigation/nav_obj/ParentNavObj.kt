package com.ahargunyllib.hackathon_kotlin_starter.presentation.ui.navigation.nav_obj

sealed class ParentNavObj (val route: String){
    data object SplashScreen0 : ParentNavObj("splash-screen-0")
}