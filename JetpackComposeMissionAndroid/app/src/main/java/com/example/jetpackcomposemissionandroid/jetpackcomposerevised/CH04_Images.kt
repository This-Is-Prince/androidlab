package com.example.jetpackcomposemissionandroid.jetpackcomposerevised

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposemissionandroid.R

@Composable
fun RevisedImageExample() {
    Image(
        painter = painterResource(R.drawable.dog),
        contentDescription = "Dog Image",
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White)
            .padding(20.dp)
            .size(300.dp)
            .border(
                width = 4.dp,
                color = Color.Red,
                shape = RoundedCornerShape(10.dp)
            )
            .clip(shape = RoundedCornerShape(40.dp)),
        alignment = Alignment.TopStart,
        contentScale = ContentScale.FillBounds,
//        alpha = 0.5f,
        colorFilter = ColorFilter.lighting(Color.Red, Color.Black)
    )
}

@Composable
fun RevisedIconExample() {
    Icon(
        imageVector = Icons.Default.Star,
        contentDescription = "Star Icon",
        tint = Color.Red,
        modifier = Modifier.size(200.dp)
    )
}






