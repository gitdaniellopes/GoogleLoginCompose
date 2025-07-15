package br.com.googlelogincompose.ui.presentation.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.googlelogincompose.R
import br.com.googlelogincompose.ui.presentation.login.components.GoogleSignInButton
import br.com.googlelogincompose.ui.presentation.login.state.LoginState

@Composable
fun LoginScreen(
    uiState: LoginState,
    onNavigateToHome: () -> Unit,
    onEvent: (LoginEvent) -> Unit,
    modifier: Modifier = Modifier
) {

    Surface(
        modifier = modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(R.drawable.firebase),
                contentDescription = "App Logo",
                modifier = Modifier
                    .padding(bottom = 32.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .size(120.dp)
            )

            Text(
                text = "Bem-vindo!",
                style = MaterialTheme.typography.headlineLarge,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Faça login para continuar",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            Spacer(modifier = Modifier.height(48.dp))

            GoogleSignInButton(
                isLoading = uiState.isLoading,
                onGoogleSignInClick = { onEvent.invoke(LoginEvent.GoogleSignInClick()) },
            )
        }
    }
}

@Preview
@Composable
private fun LoginScreenPreview() {
    LoginScreen(
        uiState = LoginState(),
        onNavigateToHome = {},
        onEvent = {}
    )
}