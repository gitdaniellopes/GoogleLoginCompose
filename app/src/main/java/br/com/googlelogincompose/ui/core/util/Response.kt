package br.com.googlelogincompose.ui.core.util

sealed class Response<out T> {
    data object Loading : Response<Nothing>()
    data class Success<out T>(val data: T?) : Response<T>()
    data class Failure(val errorMessage: String) : Response<Nothing>()
}