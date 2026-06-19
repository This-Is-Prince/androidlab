package com.example.moviesapp

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MoviesViewModel : ViewModel() {

    private val _movies = MutableStateFlow(listOf<Netflix>())
    val movies = _movies.asStateFlow()

    private val _selectedMovie = MutableStateFlow<Netflix?>(null)
    val selectedMovie = _selectedMovie.asStateFlow()

    init {
        getAllMovies()
    }

    private fun getAllMovies() {
        _movies.update {
            (1..100).map {
                Netflix(id = "$it", movie = "Movie $it", watched = false)
            }
        }
    }

    fun selectMovie(movie: Netflix?) {
        _selectedMovie.update {
            movie
        }
    }

}