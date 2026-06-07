package com.example.jetpackcomposemissionandroid.jetpackcomposerevised

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import kotlinx.coroutines.launch

@Composable
fun RevisedToastAndSnackBar() {

    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val snackBarHostState = remember { SnackbarHostState() }

    Scaffold(
        snackbarHost = {
            SnackbarHost(
                hostState = snackBarHostState
            )
        }
    ) { innerPadding ->

        Column(
            modifier = Modifier.padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = {
                    Toast.makeText(
                        context,
                        "YOooooooo",
                        Toast.LENGTH_SHORT
                    ).show()
                },
            ) {
                Text(
                    text = "Show Toast"
                )
            }

            Button(
                onClick = {
                    scope.launch {
                        snackBarHostState.showSnackbar(
                            message = "Yooo Snackyyyy",
                            actionLabel = "Delete",
                            duration = SnackbarDuration.Long,
                        )
                    }
                },
            ) {
                Text(
                    text = "Show SnackBar"
                )
            }
        }
    }
}