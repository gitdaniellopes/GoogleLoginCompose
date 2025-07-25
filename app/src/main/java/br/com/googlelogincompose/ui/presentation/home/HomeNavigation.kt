package br.com.googlelogincompose.ui.presentation.home

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

@Serializable
data object HomeDestination

fun NavGraphBuilder.homeScreen() {

    composable<HomeDestination> {
        HomeScreen()
    }
}