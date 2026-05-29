package com.example.jetpackcomposemissionandroid.jetpackcompose

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

//@Preview(showBackground = true)
@Composable
fun TextExample() {
    Text(
        text = "Mission Android 2026",
        color = Color.Blue,
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Serif,
        letterSpacing = 2.sp,
        textAlign = TextAlign.End,
    )
}

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TextFieldExample() {
    var name by remember { mutableStateOf("HI") }

    TextField(
        value = name,
        onValueChange = { name = it },
//        label = { Text(text = "Enter your name!") },
        placeholder = { Text(text = "Enter your name: ") },
        leadingIcon = { Text(text = "*", fontSize = 20.sp, fontWeight = FontWeight.Bold) },
        trailingIcon = { Text(text = "*", fontSize = 20.sp, fontWeight = FontWeight.Bold) },
        singleLine = true,
//        shape = RoundedCornerShape(10.dp)
        shape = CircleShape,
        colors = TextFieldDefaults.colors(
            unfocusedTextColor = Color.Red,
            focusedTextColor = Color.Green,
            unfocusedContainerColor = Color.White,
            focusedContainerColor = Color.Yellow,
            unfocusedIndicatorColor = Color.Black,
            focusedIndicatorColor = Color.Red,
            cursorColor = Color.Blue,
        )
    )
}

@Composable
fun OutlineTextFieldExample() {

    var name by remember { mutableStateOf("") }

    OutlinedTextField(
        value = name,
        onValueChange = { name = it },
        label = { Text(text = "Enter your name: ") },
        placeholder = { Text(text = "Enter your name please! ") },
        leadingIcon = { Text(text = "*", fontSize = 20.sp, fontWeight = FontWeight.Bold) },
        trailingIcon = { Text(text = "*", fontSize = 20.sp, fontWeight = FontWeight.Bold) },
        singleLine = true,
        shape = CircleShape,
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedTextColor = Color.Red,
            focusedTextColor = Color.Green,
            unfocusedContainerColor = Color.White,
            focusedContainerColor = Color.Yellow,
            unfocusedBorderColor = Color.Red,
            focusedBorderColor = Color.Red,
            cursorColor = Color.Blue,
        )
    )

}









