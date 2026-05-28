package com.example.jetpackcomposemissionandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.jetpackcomposemissionandroid.jetpackcompose.OutlineTextFieldExample
import com.example.jetpackcomposemissionandroid.jetpackcompose.TextFieldExample
import com.example.jetpackcomposemissionandroid.ui.theme.JetpackComposeMissionAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeMissionAndroidTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    RendererUI(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun RendererUI(modifier: Modifier = Modifier) {
    Box(modifier = modifier) {
//        TextFieldExample()
        OutlineTextFieldExample()
    }

}
