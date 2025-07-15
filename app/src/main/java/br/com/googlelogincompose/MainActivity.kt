package br.com.googlelogincompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import br.com.googlelogincompose.ui.presentation.home.HomeDestination
import br.com.googlelogincompose.ui.presentation.home.homeScreen
import br.com.googlelogincompose.ui.presentation.login.LoginDestination
import br.com.googlelogincompose.ui.presentation.login.loginScreen
import br.com.googlelogincompose.ui.theme.GoogleLoginComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            val navController = rememberNavController()

            GoogleLoginComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = LoginDestination,
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        loginScreen(
                            onNavigateToHome = { navController.navigate(HomeDestination) }
                        )
                        homeScreen()
                    }
                }
            }
        }
    }
}