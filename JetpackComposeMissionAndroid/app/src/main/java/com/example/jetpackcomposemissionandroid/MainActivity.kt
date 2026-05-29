package com.example.jetpackcomposemissionandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.jetpackcomposemissionandroid.jetpackcompose.BoxExample
import com.example.jetpackcomposemissionandroid.jetpackcompose.ColumnExample
import com.example.jetpackcomposemissionandroid.jetpackcompose.ColumnExample02
import com.example.jetpackcomposemissionandroid.jetpackcompose.ButtonExample
import com.example.jetpackcomposemissionandroid.jetpackcompose.CardExample
import com.example.jetpackcomposemissionandroid.jetpackcompose.HorizontalDividerExample
import com.example.jetpackcomposemissionandroid.jetpackcompose.IconButtonExample
import com.example.jetpackcomposemissionandroid.jetpackcompose.IconExample
import com.example.jetpackcomposemissionandroid.jetpackcompose.ImagesExample
import com.example.jetpackcomposemissionandroid.jetpackcompose.LoginScreen
import com.example.jetpackcomposemissionandroid.jetpackcompose.ModifiersExample
import com.example.jetpackcomposemissionandroid.jetpackcompose.OutlineTextFieldExample
import com.example.jetpackcomposemissionandroid.jetpackcompose.OutlinedButtonExample
import com.example.jetpackcomposemissionandroid.jetpackcompose.RememberSaveableExample
import com.example.jetpackcomposemissionandroid.jetpackcompose.RowExample
import com.example.jetpackcomposemissionandroid.jetpackcompose.StateManagementExample
import com.example.jetpackcomposemissionandroid.jetpackcompose.TextButtonExample
import com.example.jetpackcomposemissionandroid.jetpackcompose.TextFieldExample
import com.example.jetpackcomposemissionandroid.jetpackcompose.VerticalDividerExample
import com.example.jetpackcomposemissionandroid.jetpackcomposerevised.RevisedBoxExample
import com.example.jetpackcomposemissionandroid.jetpackcomposerevised.RevisedButtonExample
import com.example.jetpackcomposemissionandroid.jetpackcomposerevised.RevisedColumnExample
import com.example.jetpackcomposemissionandroid.jetpackcomposerevised.RevisedIconExample
import com.example.jetpackcomposemissionandroid.jetpackcomposerevised.RevisedImageExample
import com.example.jetpackcomposemissionandroid.jetpackcomposerevised.RevisedModifiers
import com.example.jetpackcomposemissionandroid.jetpackcomposerevised.RevisedRowExample
import com.example.jetpackcomposemissionandroid.jetpackcomposerevised.RevisedOutlinedTextFieldExample
import com.example.jetpackcomposemissionandroid.jetpackcomposerevised.RevisedTextExample
import com.example.jetpackcomposemissionandroid.jetpackcomposerevised.RevisedTextFieldExample
import com.example.jetpackcomposemissionandroid.ui.theme.JetpackComposeMissionAndroidTheme

class MainActivity : ComponentActivity() {
    private val showRevised = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeMissionAndroidTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    if (showRevised) {
                        RevisedRendererUI(
                            modifier = Modifier.padding(innerPadding)
                        )
                    } else {
                        RendererUI(
                            modifier = Modifier.padding(innerPadding)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun RendererUI(modifier: Modifier = Modifier) {
    Box(modifier = modifier) {
//        TextFieldExample()
//        OutlineTextFieldExample()
//        RowExample()
//        ColumnExample()
//        ColumnExample02()
//        BoxExample()
//        ModifiersExample()
//        ImagesExample()
//        IconExample()
//        ButtonExample()
//        LoginScreen()
//        OutlinedButtonExample()
//        TextButtonExample()
//        IconButtonExample()
//        CardExample()
//        HorizontalDividerExample()
//        VerticalDividerExample()
//        StateManagementExample()
        RememberSaveableExample()




    }
}

@Composable
fun RevisedRendererUI(modifier: Modifier = Modifier) {
    Column(
        modifier
    ) {
//        RevisedTextExample()
//        RevisedTextFieldExample()
//        RevisedOutlinedTextFieldExample()
//        RevisedRowExample()
//        RevisedColumnExample()
//        RevisedBoxExample()
//        RevisedModifiers()
//        RevisedImageExample()
//        RevisedIconExample()
        RevisedButtonExample()

    }
}