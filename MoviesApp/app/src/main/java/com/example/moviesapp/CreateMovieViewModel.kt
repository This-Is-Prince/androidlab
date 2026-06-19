package com.example.moviesapp

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CreateMovieViewModel: ViewModel() {

    private val _movieName = MutableStateFlow("")
    val movieName = _movieName.asStateFlow()

    private val _movieWatched = MutableStateFlow(false)
    val movieWatched = _movieWatched.asStateFlow()

    fun updateMovieName(movieName: String) {
        _movieName.update {
            movieName
        }
    }

    fun updateMovieWatched(movieWatched: Boolean) {
        _movieWatched.update {
            movieWatched
        }
    }

    fun createMovie() {

    }
}