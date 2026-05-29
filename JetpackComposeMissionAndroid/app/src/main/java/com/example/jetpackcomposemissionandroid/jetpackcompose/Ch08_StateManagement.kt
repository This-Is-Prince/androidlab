package com.example.jetpackcomposemissionandroid.jetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun StateManagementExample() {

    var score by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = "Score: $score",
            fontSize = 30.sp,
        )

        Row(

        ) {
            Button(
                onClick = { score++ },
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "Increase"
                )
            }

            Spacer(
                modifier = Modifier.width(8.dp)
            )

            Button(
                onClick = { score-- },
                modifier = Modifier.weight(1f),
                enabled = score > 0
            ) {
                Text(
                    text = "Decrease"
                )
            }

        }
    }
}

@Composable
fun RememberSaveableExample() {

    var score by rememberSaveable { mutableStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = "Score: $score",
            fontSize = 30.sp,
        )

        Row(

        ) {
            Button(
                onClick = { score++ },
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "Increase"
                )
            }

            Spacer(
                modifier = Modifier.width(8.dp)
            )

            Button(
                onClick = { score-- },
                modifier = Modifier.weight(1f),
                enabled = score > 0
            ) {
                Text(
                    text = "Decrease"
                )
            }

        }
    }
}











