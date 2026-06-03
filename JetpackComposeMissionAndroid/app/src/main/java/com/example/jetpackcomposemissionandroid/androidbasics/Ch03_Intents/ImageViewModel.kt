package com.example.jetpackcomposemissionandroid.androidbasics.Ch03_Intents

import android.net.Uri
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class ImageViewModel : ViewModel() {

    var uri: Uri? by mutableStateOf(null)
        private set

    fun updateUri(newUri: Uri?) {
        uri = newUri
    }

}