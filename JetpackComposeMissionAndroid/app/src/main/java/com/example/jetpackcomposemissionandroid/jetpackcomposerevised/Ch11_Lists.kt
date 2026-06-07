package com.example.jetpackcomposemissionandroid.jetpackcomposerevised

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun RevisedLazyColumnExample() {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        items(
            20
        ) { index ->
            Text(
                text = "Item $index",
                modifier = Modifier
                    .background(color = Color.Blue)
                    .height(100.dp),
                color = Color.White
            )
        }
    }
}


@Composable
fun RevisedLazyRowExample() {

    val names = listOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J")

    LazyRow(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        itemsIndexed(names) { index, item ->
            Text(
                text = "Item ($item) ($index)",
                modifier = Modifier.background(color = Color.Red).width(200.dp).height(50.dp),
                color = Color.White,
                textAlign = TextAlign.Center,
            )
        }
    }
}












