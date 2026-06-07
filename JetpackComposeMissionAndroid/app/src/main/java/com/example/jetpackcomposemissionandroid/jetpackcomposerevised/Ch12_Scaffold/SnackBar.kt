package com.example.jetpackcomposemissionandroid.jetpackcomposerevised.Ch12_Scaffold

import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember

@Composable
fun RevisedSnackBar(hostState: SnackbarHostState) {
    SnackbarHost(
        hostState = hostState,
    )
}