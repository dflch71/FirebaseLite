package com.dflch.firebaselite

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.dflch.firebaselite.presentation.initial.InitialScreen
import com.dflch.firebaselite.presentation.login.LoginScreen
import com.dflch.firebaselite.presentation.singup.SingUpScreen

@Composable
fun NavigationWrapper(navHostController: NavHostController) {

    NavHost(
        navController = navHostController,
        startDestination = "initial")
    {

        composable("initial") {
            InitialScreen(
                navigateToLogin = { navHostController.navigate("login") },
                navigateToSingUp = { navHostController.navigate("singUp") }
            )
        }

        composable("login") {
            LoginScreen()
        }

        composable("singUp") {
            SingUpScreen()
        }

    }

}