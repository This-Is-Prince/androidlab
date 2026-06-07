package com.example.jetpackcomposemissionandroid.jetpackcomposerevised.Ch12_Scaffold

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Event
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun RevisedBottomBar(showSnackBar: () -> Unit) {

    BottomAppBar(
        containerColor = Color.Green,
        contentColor = Color.White,
        contentPadding = PaddingValues(2.dp),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly,
        ) {
            IconButton(
                onClick = showSnackBar,
                modifier = Modifier
                    .background(color = Color.Red)
                    .weight(1f),
            ) {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "Home",
                )
            }

            IconButton(
                onClick = showSnackBar,
                modifier = Modifier
                    .background(color = Color.Blue)
                    .fillMaxHeight()
                    .weight(1f),
            ) {
                Icon(
                    imageVector = Icons.Default.Event,
                    contentDescription = "Event",
                )
            }

            IconButton(
                onClick = showSnackBar,
                modifier = Modifier
                    .background(color = Color.Gray)
                    .weight(1f),
            ) {
                Icon(
                    imageVector = Icons.Default.Create,
                    contentDescription = "Create",
                )
            }

            IconButton(
                onClick = showSnackBar,
                modifier = Modifier
                    .background(color = Color.Cyan)
                    .weight(1f),
            ) {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Person",
                )
            }

        }
    }
}