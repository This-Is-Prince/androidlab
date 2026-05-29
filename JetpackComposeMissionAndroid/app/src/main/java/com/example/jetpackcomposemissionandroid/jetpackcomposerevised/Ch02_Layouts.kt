package com.example.jetpackcomposemissionandroid.jetpackcomposerevised

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp

@Composable
fun RevisedRowExample() {
    Row(
        modifier = Modifier
            .background(
                color = Color.Red
            )
            .height(200.dp)
            .width(300.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
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
    }
}

@Composable
fun RevisedColumnExample() {
    Column(
        modifier = Modifier
            .background(
                color = Color.Red
            )
            .height(200.dp)
            .width(300.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.End,
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

    }
}

@Composable
fun RevisedBoxExample() {
    Box(
        modifier = Modifier
            .background(
                color = Color.Red
            )
            .height(200.dp)
            .width(300.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "First",
            modifier = Modifier.align(Alignment.TopStart)
        )
        Text(
            text = "Second",
            modifier = Modifier.align(Alignment.Center)
        )

        Text(
            text = "Third",
            modifier = Modifier.align(Alignment.BottomEnd)
        )
    }
}














