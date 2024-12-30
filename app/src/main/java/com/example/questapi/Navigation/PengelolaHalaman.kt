package com.example.questapi.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.questapi.ui.theme.View.DestinasiDetail
import com.example.questapi.ui.theme.View.DestinasiEntry
import com.example.questapi.ui.theme.View.DestinasiHome
import com.example.questapi.ui.theme.View.DestinasiUpdate
import com.example.questapi.ui.theme.View.DetailView
import com.example.questapi.ui.theme.View.EntryMhsScreen
import com.example.questapi.ui.theme.View.HomeScreen
import com.example.questapi.ui.theme.View.UpdateEntryScreen

@Composable
fun PengelolaHalaman(navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = Modifier
    ) {
        composable(DestinasiHome.route) {
            HomeScreen(
                navigateToItemEntry = {
                    navController.navigate(DestinasiEntry.route)
                },
                onDetailClick = {nim ->
                    if (nim.isNotEmpty()) {
                        navController.navigate("${DestinasiDetail.route}/$nim")
                    }
                }
            )
        }
        composable(DestinasiEntry.route) {
            EntryMhsScreen(
                navigateBack = {
                    navController.navigate(DestinasiHome.route) {
                        popUpTo(DestinasiHome.route) {
                            inclusive = true
                        }
                    }
                }
            )
        }
        composable(
            route = "${DestinasiDetail.route}/{nim}",
            arguments = listOf(navArgument("nim") { type = NavType.StringType })
        ) { backStackEntry ->
            val nim = backStackEntry.arguments?.getString("nim") ?: ""
            DetailView(
                nim = nim,
                navigateBack = {
                    navController.navigate(DestinasiHome.route) {
                        popUpTo(DestinasiHome.route) {
                            inclusive = true
                        }
                    }
                },
                onClick = {
                    navController.navigate("${DestinasiUpdate.route}/$nim")
                }
            )
        }
        composable(
            route = "${DestinasiUpdate.route}/{nim}",
            arguments = listOf(navArgument("nim") { type = NavType.StringType })
        ) { backStackEntry ->
            val nim = backStackEntry.arguments?.getString("nim") ?: ""
            UpdateEntryScreen(
                nim = nim,
                navigateBack = {
                    navController.navigate(DestinasiHome.route) {
                        popUpTo(DestinasiHome.route) {
                            inclusive = true
                        }
                    }
                }
            )
        }
    }
}