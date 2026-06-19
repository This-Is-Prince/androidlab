package com.example.moviesapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.RemoveRedEye
import androidx.compose.material.icons.outlined.RemoveRedEye
import androidx.compose.material.icons.rounded.RemoveRedEye
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController

@Composable
fun MoviesScreen(
    paddingValues: PaddingValues,
    rootNavController: NavHostController,
    moviesViewModel: MoviesViewModel = viewModel()
) {

    val movies = moviesViewModel.movies.collectAsStateWithLifecycle()

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.Start,
    ) {
        items(items = movies.value) { movie ->
            MovieItem(
                movie = movie,
                onMovieClick = {
                    rootNavController.navigate(RootRoutes.SingleMovie(movie.id)) {
                        popUpTo(rootNavController.graph.startDestinationId) {
                            saveState = true
                        }

                        launchSingleTop = true
                        restoreState = true
                    }
                },
                onMovieWatchedToggle = {
                    moviesViewModel.selectMovie(movie)
                },
                onMovieDeleteClick = {
                    moviesViewModel.selectMovie(movie)

                }
            )
        }
    }
}

@Composable
fun MovieItem(
    movie: Netflix,
    onMovieClick: () -> Unit,
    onMovieWatchedToggle: () -> Unit,
    onMovieDeleteClick: () -> Unit
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = Color.Black,
                shape = RoundedCornerShape(8.dp)
            )
            .padding(12.dp),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.Transparent,
            contentColor = Color.White,
        ),
        onClick = onMovieClick
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = movie.movie,
                modifier = Modifier.weight(1f)
            )

            Row(

            ) {
                IconButton(
                    onClick = onMovieWatchedToggle,
                    colors = IconButtonDefaults.iconButtonColors(
                        contentColor = Color.Green,
                    )
                ) {
                    Icon(
                        imageVector = if (movie.watched) Icons.Filled.RemoveRedEye else Icons.Rounded.RemoveRedEye,
                        contentDescription = "movie watched"
                    )
                }

                IconButton(
                    onClick = onMovieDeleteClick,
                    colors = IconButtonDefaults.iconButtonColors(
                        contentColor = Color.Red,
                    )
                ) {
                    Icon(
                        imageVector = Icons.Default.Delete,
                        contentDescription = ""
                    )
                }
            }
        }
    }
}