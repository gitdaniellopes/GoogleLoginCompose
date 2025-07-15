package br.com.googlelogincompose.ui.presentation.login

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import br.com.googlelogincompose.ui.presentation.login.state.LoginState
import kotlinx.serialization.Serializable

@Serializable
data object LoginDestination

fun NavGraphBuilder.loginScreen(
    onNavigateToHome: () -> Unit
) {

    composable<LoginDestination> {
        LoginScreen(
            uiState = LoginState(),
            onNavigateToHome = { onNavigateToHome() },
            onEvent = { }
        )
    }
}