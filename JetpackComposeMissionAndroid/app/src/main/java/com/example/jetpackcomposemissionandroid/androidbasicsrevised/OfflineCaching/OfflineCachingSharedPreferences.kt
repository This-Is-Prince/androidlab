package com.example.jetpackcomposemissionandroid.androidbasicsrevised.OfflineCaching

import android.content.Context
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.core.content.edit

@Composable
fun OfflineCachingSharedPreferences() {

    val context = LocalContext.current

    val sharedPreferences = remember {
        context.getSharedPreferences("my_shared_pref", Context.MODE_PRIVATE)
    }

    var data by remember { mutableStateOf("") }

    var showSavedData by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        TextField(
            value = data,
            onValueChange = { data = it }
        )


        Button(
            onClick = {
                showSavedData = !showSavedData
            }
        ) {
            Text(
                text = "Toggle Show Data"
            )
        }

        if (showSavedData) {
            Text(
                text = "Data: ${sharedPreferences.getString("data", "")?: "N/A"}"
            )
        }

        Button(
            onClick = {
                sharedPreferences.edit {
                    putString("data", data)
                }
            }
        ) {
            Text(
                text = "Save Data"
            )
        }
    }
}
