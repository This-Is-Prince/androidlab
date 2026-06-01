package com.example.jetpackcomposemissionandroid.jetpackcomposerevised

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Doorbell
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties

@Composable
fun RevisedAlertDialogExample() {

    var showDialog by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Button(
            onClick = {
                showDialog = true
            }
        ) {
            Text(
                text = "Open Dialog",
            )
        }

        if (showDialog) {
            AlertDialog(
                onDismissRequest = {
                    showDialog = false
                },
                confirmButton = {
                    Button(
                        onClick = {
                            showDialog = false
                        }
                    ) {
                        Text(
                            text = "Yooo"
                        )
                    }
                },
                dismissButton = {
                    Button(
                        onClick = {
                            showDialog = false
                        }
                    ) {
                        Text(
                            text = "Nooo"
                        )
                    }
                },
                icon = {
                    Icon(
                        imageVector = Icons.Default.Doorbell,
                        contentDescription = "Door bell"
                    )
                },
                title = {
                    Text(
                        text = "Ohh yesss"
                    )
                },
                text = {
                    Column(
                        modifier = Modifier.background(color = Color.Red),
                        verticalArrangement = Arrangement.spacedBy(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Text(
                            text = "First"
                        )
                        Text(
                            text = "Second"
                        )
                        Text(
                            text = "Third"
                        )
                        Text(
                            text = "Fourth"
                        )
                    }
                },
                shape = RectangleShape,
                containerColor = Color.Black,
                iconContentColor = Color.White,
                titleContentColor = Color.White,
                textContentColor = Color.White,
                tonalElevation = 100.dp,
                properties = DialogProperties(
                    dismissOnBackPress = true,
                    dismissOnClickOutside = true,
                )
            )
        }
    }

}





