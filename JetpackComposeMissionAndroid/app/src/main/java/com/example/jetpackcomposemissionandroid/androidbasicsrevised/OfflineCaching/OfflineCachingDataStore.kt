package com.example.jetpackcomposemissionandroid.androidbasicsrevised.OfflineCaching

import android.content.Context
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch


val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "settings")
val DATA_PREFERENCES_KEY = stringPreferencesKey("data")

@Composable
fun OfflineCachingDataStore() {

    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    val dataFlow = remember {
        context.dataStore.data.map { preferences ->
            preferences[DATA_PREFERENCES_KEY] ?: ""
        }
    }

    val savedData by dataFlow.collectAsState(initial = "")

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
                text = "Data: $savedData"
            )
        }

        Button(
            onClick = {
                scope.launch {
                    context.dataStore.edit { preferences ->
                        preferences[DATA_PREFERENCES_KEY] = data
                    }
                }
            }
        ) {
            Text(
                text = "Save Data"
            )
        }
    }
}


