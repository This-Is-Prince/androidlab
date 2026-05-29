package com.example.jetpackcomposemissionandroid.jetpackcomposerevised

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun RevisedModifiers() {
    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(40.dp))
            .background(color = Color.Red)
            .padding(20.dp)
            .size(300.dp)
            .border(
                width = 3.dp, color = Color.Black,
                shape = RoundedCornerShape(2.dp)
            )
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
