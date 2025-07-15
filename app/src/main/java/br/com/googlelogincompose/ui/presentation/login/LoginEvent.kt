package br.com.googlelogincompose.ui.presentation.login

sealed class LoginEvent {
    data class GoogleSignInClick(val requiredAuthorized: Boolean = false) : LoginEvent()
}