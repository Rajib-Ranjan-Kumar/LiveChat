package com.example.livechat99.Utils

sealed class NavigationRoutes(val Route:String) {
    object LogInR:NavigationRoutes("login")
    object SignUpR:NavigationRoutes("sigup")
}