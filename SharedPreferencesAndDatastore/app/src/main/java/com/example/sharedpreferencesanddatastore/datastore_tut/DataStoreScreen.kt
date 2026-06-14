package com.example.sharedpreferencesanddatastore.datastore_tut

import android.content.Context
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.datastore.dataStore
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch

private val Context.dataStore by dataStore(
    fileName = "user-preferences",
    serializer = UserPreferencesSerializer,
)

private const val SECRET_TOKEN = "Hello World!"

@Composable
fun DataStoreScreen(modifier: Modifier) {

    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    var text by remember {
        mutableStateOf("")
    }

    Column(
        modifier = modifier.fillMaxSize()
    ) {
        Button(
            onClick = {
                scope.launch {
                    context.dataStore.updateData {
                        UserPreferences(
                            token = SECRET_TOKEN
                        )
                    }
                }
            }
        ) {
            Text(
                text = "Encrypt"
            )
        }

        Button(
            onClick = {
                scope.launch {
                    text = context.dataStore.data.first().token ?: ""
                }
            }
        ) {
            Text(
                text = "Decrypt"
            )
        }

        Text(
            text = text
        )
    }
}