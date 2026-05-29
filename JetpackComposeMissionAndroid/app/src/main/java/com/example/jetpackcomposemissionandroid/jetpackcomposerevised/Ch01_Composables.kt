package com.example.jetpackcomposemissionandroid.jetpackcomposerevised

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicSecureTextField
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.SecureTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TextFieldDefaults.indicatorLine
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.drawscope.DrawStyle
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RevisedTextExample() {
    Text(
        text = "Revised Text Example, Revised Text Example, Revised Text Example, Revised Text Example, Revised Text Example, Revised Text Example",
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .background(color = Color.Red),
//        maxLines = 5,
        minLines = 2,
        color = Color.Green,
        fontSize = 20.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Italic,
        lineHeight = 50.sp,
        letterSpacing = 4.sp,
        textAlign = TextAlign.Center,
        textDecoration = TextDecoration.LineThrough,
        style = TextStyle(
            drawStyle = Stroke()
        )
    )
}

@Composable
fun RevisedTextFieldExample() {

    var value by remember { mutableStateOf("") }

    TextField(
        value = value,
        onValueChange = { value = it },
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = Color.Red
            )
            .padding(10.dp),
        textStyle = TextStyle(
            drawStyle = Stroke()
        ),
        shape = RoundedCornerShape(4.dp),
        colors = TextFieldDefaults.colors(
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
            errorIndicatorColor = Color.Transparent
        )
    )
}

class EmailVisualTransformation(val mask: Char = '@') : VisualTransformation {
    override fun filter(text: AnnotatedString): TransformedText {
        val filtered: String = text.text.replace('@', mask)

        return TransformedText(
            AnnotatedString(filtered),
            OffsetMapping.Identity,
        )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EmailVisualTransformation) return false
        if (mask != other.mask) return false
        return true
    }

    override fun hashCode(): Int {
        return mask.hashCode()
    }
}


@Composable
fun RevisedOutlinedTextFieldExample() {

    var value by remember { mutableStateOf("") }

    SecureTextField(
        state = TextFieldState()
    )
    BasicSecureTextField(
        state = TextFieldState()
    )

    OutlinedTextField(
        value = value,
        onValueChange = { value = it },
        supportingText = {
            Text(
                text = "Support!!!"
            )
        },
        visualTransformation = EmailVisualTransformation('#'),
        textStyle = TextStyle(
            platformStyle = PlatformTextStyle(
                includeFontPadding = true,
            )
        )
    )
}






