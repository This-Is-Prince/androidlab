package com.example.jetpackcomposemissionandroid.sharedpref

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.core.content.edit
import com.example.jetpackcomposemissionandroid.R

@Composable
fun SharedPreferences() {

    val context = LocalContext.current

    var userName by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp).verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {

        Image(
            painter = painterResource(R.drawable.dog),
            contentDescription = "Dog",
            modifier = Modifier
                .size(250.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop,
        )

        Spacer(
            modifier = Modifier.height(20.dp)
        )

        TextField(
            value = userName,
            onValueChange = { userName = it },
            label = {
                Text(
                    text = "Username"
                )
            },
            modifier = Modifier.fillMaxWidth(),
        )

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        TextField(
            value = password,
            onValueChange = { password = it },
            label = {
                Text(
                    text = "Password"
                )
            },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(
            modifier = Modifier.height(20.dp)
        )

        Button(
            onClick = {
                val sharedPref =
                    context.getSharedPreferences("MyPref", Context.MODE_PRIVATE).apply {
                        edit {
                            putString("username", userName)
                            putString("password", password)
                        }
                    }

            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Save Data"
            )
        }

        Button(
            onClick = {
                val sharedPref =
                    context.getSharedPreferences("MyPref", Context.MODE_PRIVATE).apply {
                        val savedUserName = getString("username", "")
                        val savedPassword = getString("password", "")

                        userName = savedUserName?: ""
                        password = savedPassword?: ""
                    }

            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Show Data"
            )
        }
    }
}






