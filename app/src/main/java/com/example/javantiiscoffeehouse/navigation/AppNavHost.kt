package com.example.javantiiscoffeehouse.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.javantiiscoffeehouse.ui.theme.screens.products.ViewProductsScreen
import com.example.javantisassociation.ui.theme.screens.home.HomeScreen
import com.example.javantisassociation.ui.theme.screens.login.LoginScreen
import com.example.javantisassociation.ui.theme.screens.signup.SignupScreen
import com.example.javantisassociation.ui.theme.screens.splash.SplashScreen
import com.example.javantiiscoffeehouse.navigation.ADD_PRODUCTS_URL
import com.example.javantiiscoffeehouse.navigation.ROUT_HOME
import com.example.javantiiscoffeehouse.navigation.ROUT_LOGIN
import com.example.javantiiscoffeehouse.navigation.ROUT_SIGNUP
import com.example.javantiiscoffeehouse.navigation.ROUT_SPLASH
import com.example.javantiiscoffeehouse.navigation.VIEW_PRODUCTS_URL


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = ROUT_SPLASH
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {


        composable(ROUT_HOME) {
            HomeScreen(navController = navController)
        }

        composable(ROUT_SPLASH) {
            SplashScreen(navController = navController)
        }

        composable(ROUT_SIGNUP) {
            SignupScreen(navController = navController)
        }
        composable(ROUT_LOGIN) {
            LoginScreen(navController = navController)
        }

        composable(ADD_PRODUCTS_URL) {
            AddProductsScreen(navController = navController)
        }
        composable(VIEW_PRODUCTS_URL) {
            ViewProductsScreen(navController = navController)
        }



    }
}

@Composable
fun AddProductsScreen(navController: NavHostController) {

}
