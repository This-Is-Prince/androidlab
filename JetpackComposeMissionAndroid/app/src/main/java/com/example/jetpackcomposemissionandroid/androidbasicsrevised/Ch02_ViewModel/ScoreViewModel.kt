package com.example.jetpackcomposemissionandroid.androidbasicsrevised.Ch02_ViewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class RevisedScoreViewModel: ViewModel() {

    var counter by mutableStateOf(0)
}