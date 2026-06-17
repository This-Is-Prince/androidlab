package com.example.kotincoroutines

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
fun MainScreen(contentPadding: PaddingValues, mainScreenViewModel: MainScreenViewModel) {

    val fbFollowersUsingLaunch =
        mainScreenViewModel.fbFollowersUsingLaunch.collectAsStateWithLifecycle()
    val fbFollowersUsingAsync =
        mainScreenViewModel.fbFollowersUsingAsync.collectAsStateWithLifecycle()

    Column(
        modifier = Modifier
            .padding(contentPadding)
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
        ) {
            Text(
                text = "Launch: ${fbFollowersUsingLaunch.value ?: "N/A"}"
            )

            Spacer(
                modifier = Modifier.width(16.dp)
            )

            Text(
                text = "Async: ${fbFollowersUsingAsync.value ?: "N/A"}"
            )
        }

        HorizontalDivider(
            modifier = Modifier.padding(vertical = 16.dp)
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
        ) {
            Button(
                onClick = {
                    mainScreenViewModel.fetchFbFollowersUsingLaunch()
                }
            ) {
                Text(
                    text = "Launch"
                )
            }

            Spacer(
                modifier = Modifier.width(16.dp)
            )

            Button(
                onClick = {
                    mainScreenViewModel.fetchFbFollowersUsingAsync()
                }
            ) {
                Text(
                    text = "Async"
                )
            }

        }
    }
}