package com.germantv.composetvapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.germantv.composetvapp.screens.MovieScreens
import com.germantv.composetvapp.screens.details.DetailScreen
import com.germantv.composetvapp.screens.home.HomeScreen

@Composable
fun MovieNavigation() {
    val navNavigation = rememberNavController()
    NavHost(
        navController = navNavigation,
        startDestination = MovieScreens.HomeScreen.name
    ) {
        composable(MovieScreens.HomeScreen.name) {
            HomeScreen(navController = navNavigation)
        }
        composable(MovieScreens.DetailScreen.name + "/{movie}",
            arguments = listOf(navArgument(name = "movie") {
                type = NavType.StringType
            })
        ) {
            NavBackStackEntry ->
            DetailScreen(navController = navNavigation,NavBackStackEntry.arguments?.getString("movie"))
            //HomeScreen(navController = navNavigation)
        }

    }
}