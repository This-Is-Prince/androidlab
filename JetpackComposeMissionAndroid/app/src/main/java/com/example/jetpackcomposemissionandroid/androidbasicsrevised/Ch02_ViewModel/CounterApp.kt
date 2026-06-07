package com.example.jetpackcomposemissionandroid.androidbasicsrevised.Ch02_ViewModel

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun RevisedViewModel(scoreViewModel: RevisedScoreViewModel) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Button(
            onClick = {
                scoreViewModel.counter++
            }
        ) {
            Text(
                text = "Increase"
            )
        }

        Text(
            text = "Score ${scoreViewModel.counter}"
        )

        Button(
            onClick = {
                scoreViewModel.counter--
            }
        ) {
            Text(
                text = "Decrease"
            )
        }
    }
}