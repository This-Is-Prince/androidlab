package com.example.jetpackcomposemissionandroid.jetpackcomposerevised.Ch12_Scaffold

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.RectangleShape

@Composable
fun RevisedFloatingActionButton(showSnackBar: () -> Unit) {

    FloatingActionButton(
        onClick = showSnackBar,
        shape = RectangleShape,
    ) {
        Icon(
            imageVector = Icons.Default.Create,
            contentDescription = "Float Button"
        )
    }
}