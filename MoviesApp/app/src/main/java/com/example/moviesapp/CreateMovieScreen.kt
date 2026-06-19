package com.example.moviesapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun CreateMovieScreen(
    paddingValues: PaddingValues,
    createMovieViewModel: CreateMovieViewModel = viewModel()
) {

    val movieName = createMovieViewModel.movieName.collectAsStateWithLifecycle()
    val movieWatched = createMovieViewModel.movieWatched.collectAsStateWithLifecycle()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = movieName.value,
            onValueChange = {
                createMovieViewModel.updateMovieName(it)
            },
            placeholder = {
                Text(
                    text = "Enter movie name:-"
                )
            },
            label = {
                Text(
                    text = "Movie Name"
                )
            }
        )

        Spacer(
            modifier = Modifier.height(12.dp)
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
        ) {
            Switch(
                checked = movieWatched.value,
                onCheckedChange = {
                    createMovieViewModel.updateMovieWatched(it)
                },
            )

            Spacer(
                modifier = Modifier.width(16.dp)
            )

            Text(
                text = "Movie Watched?"
            )
        }

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        Button(
            onClick = {
                createMovieViewModel.createMovie()
            }
        ) {
            Text(
                text = "Create Movie"
            )
        }
    }
}