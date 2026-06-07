package com.example.jetpackcomposemissionandroid.jetpackcomposerevised.Ch12_Scaffold

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun RevisedMainApp(modifier: Modifier) {

    Column(
        modifier = modifier
            .padding(8.dp)
            .background(color = Color.Blue)
    ) {
        Text(
            text = "Hey",
            color = Color.White,
        )

        Text(
            text = "Hello",
            color = Color.White,
        )
    }
}