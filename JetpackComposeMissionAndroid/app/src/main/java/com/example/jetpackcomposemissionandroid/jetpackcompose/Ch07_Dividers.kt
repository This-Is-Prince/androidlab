package com.example.jetpackcomposemissionandroid.jetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp

@Composable
fun HorizontalDividerExample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(text = "Profile Details")
        HorizontalDivider()
        Text(text = "Profile Details")
    }
}

@Composable
fun VerticalDividerExample() {
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(text = "Profile Details")
        VerticalDivider(
            modifier = Modifier
                .height(50.dp)
                .padding(horizontal = 16.dp),
            thickness = 1.dp,
            color = Color.Blue
        )
        Text(text = "Profile Details")
    }
}