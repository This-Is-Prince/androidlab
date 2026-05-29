package com.example.jetpackcomposemissionandroid.jetpackcomposerevised

import android.widget.Button
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Start
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun RevisedButtonExample() {
    Column(
        modifier = Modifier.fillMaxSize().background(color = Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Button(
            onClick = { println("Clicked!") },
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 20.dp
            )
        ) {
            Text("Click me to Test")
        }

        OutlinedButton(
            onClick = {},
            colors = ButtonDefaults.outlinedButtonColors(
                containerColor = Color.Green,

            ),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 40.dp
            )
        ) {
            Text("Outline button")
        }

        TextButton(
            onClick = { },
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 25.dp
            )
        ) {
            Text("Text Button")
        }

        IconButton (
            onClick = { }
        ) {
            Icon(
                imageVector = Icons.Default.Start,
                contentDescription = "Start",
            )
        }
    }

}