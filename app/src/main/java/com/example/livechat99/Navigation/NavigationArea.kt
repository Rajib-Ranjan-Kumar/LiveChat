package com.example.livechat99.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.livechat99.Utils.NavigationRoutes
import com.example.livechat99.view.LogIn
import com.example.livechat99.view.SignUp

@Composable
fun NavigationArea() {
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination = NavigationRoutes.LogInR.Route) {
        composable(NavigationRoutes.LogInR.Route){
            LogIn(navController)
        }
        composable(NavigationRoutes.SignUpR.Route){
            SignUp(navController)
        }

    }

}