package com.example.jetpackcomposemissionandroid.androidbasics.Ch03_Intents

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.core.net.toUri
import coil3.compose.AsyncImage

@Composable
fun MainActivityRender(viewModel: ImageViewModel) {

    val context = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {

        AsyncImage(
            model = viewModel.uri,
            contentDescription = null,
        )

        Text(
            text = "Main Activity"
        )

        Button(
            onClick = {
                val intent = Intent(
                    context, SecondActivity::class.java,
                )
                context.startActivity(intent)
            }
        ) {
            Text(
                text = "Go to Second Activity"
            )
        }

        Button(
            onClick = {
                val uri = "https://google.com".toUri()
                val intent = Intent(Intent.ACTION_VIEW).apply {
                    data = uri
                }
                context.startActivity(intent)
            }
        ) {
            Text(
                text = "Go to Google!"
            )
        }


        Button(
            onClick = {
                val intent = Intent(Intent.ACTION_MAIN).apply {
                    setPackage("com.google.android.apps.maps")
                }

                try {
                    context.startActivity(intent)
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        ) {
            Text(
                text = "Open Google Maps!"
            )
        }


        Button(
            onClick = {
                val intent = Intent(Intent.ACTION_SEND).apply {
                    type = "text/plain"
                    putExtra(Intent.EXTRA_TEXT, "Hi! I am from Mission Android 2026!")
                }

                context.startActivity(Intent.createChooser(intent, "Share Via!"))
            }
        ) {
            Text(
                text = "Send Text Message"
            )
        }
    }
}












