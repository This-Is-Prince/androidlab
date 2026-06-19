package com.example.moviesapp

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlin.time.Duration.Companion.milliseconds

sealed class SingleMovieState {
    object Loading: SingleMovieState()
    data class Success(val movie: Netflix): SingleMovieState()
    data class Error(val error: String): SingleMovieState()
}

class SingleMovieViewModel: ViewModel() {

    private val _movieState = MutableStateFlow<SingleMovieState>(SingleMovieState.Loading)
    val movieState = _movieState.asStateFlow()

    suspend fun fetchMovie(movieId: String) {
        delay(1000.milliseconds)
        _movieState.update {
            SingleMovieState.Success(
                Netflix(
                    id = movieId,
                    movie = "Jurassic Park",
                    watched =  false,
                )
            )
        }
    }



}