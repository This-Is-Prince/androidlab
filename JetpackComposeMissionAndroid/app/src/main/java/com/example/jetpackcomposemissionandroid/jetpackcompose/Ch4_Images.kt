package com.example.jetpackcomposemissionandroid.jetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposemissionandroid.R

@Composable
fun ImagesExample() {
    Image(
        painter = painterResource(R.drawable.dog),
        contentDescription = "Dog Image",
        alignment = Alignment.CenterStart,
        modifier = Modifier
            .background(color = Color.Red)
            .padding(16.dp)
            .size(300.dp)
            .clip(
                shape = RoundedCornerShape(16.dp)
            ),
        contentScale = ContentScale.FillBounds
    )
}

@Composable
fun IconExample() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Icon(
            imageVector = Icons.Default.Person,
            contentDescription = "Person Icon",
            modifier = Modifier.size(200.dp),
            tint = Color.Red,
        )
    }
}



















