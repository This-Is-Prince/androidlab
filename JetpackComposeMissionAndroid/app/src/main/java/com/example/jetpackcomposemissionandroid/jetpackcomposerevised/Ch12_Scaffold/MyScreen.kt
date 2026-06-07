package com.example.jetpackcomposemissionandroid.jetpackcomposerevised.Ch12_Scaffold

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kotlinx.coroutines.launch

@Composable
fun RevisedMyScreen() {

    val scope = rememberCoroutineScope()

    val snackBarHostState = remember { SnackbarHostState() }

    Scaffold(
        topBar = {
            RevisedTopBar {
                scope.launch {
                    snackBarHostState.showSnackbar(
                        message = "Top Bar Snackbar",
                        actionLabel = "Undo",
                        duration = SnackbarDuration.Short,
                    )
                }
            }
        },
        bottomBar = {
            RevisedBottomBar {
                scope.launch {
                    snackBarHostState.showSnackbar(
                        message = "Top Bar Bottom Bar",
                        actionLabel = "Undo",
                        duration = SnackbarDuration.Short,
                    )
                }
            }
        },
        floatingActionButton = {
            RevisedFloatingActionButton {
                scope.launch {
                    snackBarHostState.showSnackbar(
                        message = "Top Bar Floating Action Button",
                        actionLabel = "Undo",
                        duration = SnackbarDuration.Short,
                    )
                }
            }
        },
        snackbarHost = { RevisedSnackBar(snackBarHostState) },
        containerColor = Color.Red
    ) { innerPadding ->
        RevisedMainApp(
            modifier = Modifier
                .padding(innerPadding)
        )
    }
}