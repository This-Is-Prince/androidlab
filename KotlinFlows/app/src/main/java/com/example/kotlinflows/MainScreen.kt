package com.example.kotlinflows

import android.util.Log
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
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
fun MainScreen(contentPadding: PaddingValues, mainScreenViewModel: MainScreenViewModel) {

    val continuousNumber = mainScreenViewModel.continuousNumber.collectAsState()

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
            Log.d("Check: ", "${continuousNumber.value}")
            Text(
                text = "Launch: ${continuousNumber.value}"
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

                }
            ) {
                Text(
                    text = "Start"
                )
            }

            Spacer(
                modifier = Modifier.width(16.dp)
            )

            Button(
                onClick = {

                }
            ) {
                Text(
                    text = "Stop"
                )
            }

        }
    }
}