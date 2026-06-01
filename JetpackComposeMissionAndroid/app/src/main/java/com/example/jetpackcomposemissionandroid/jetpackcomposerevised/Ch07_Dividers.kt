package com.example.jetpackcomposemissionandroid.jetpackcomposerevised

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RevisedDividers() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "First"
        )

        HorizontalDivider(
            modifier = Modifier.width(40.dp),
            thickness = 20.dp
        )

        Text(
            text = "Second"
        )

        VerticalDivider(
            modifier = Modifier.height(40.dp),
            thickness = 20.dp
        )

        Text(
            text = "Third"
        )

        Text(
            text = "Fourth"
        )
    }
}