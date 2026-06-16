package com.example.serializationanddeserialization

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import kotlinx.serialization.json.Json

@Composable
fun MainScreen(contentPadding: PaddingValues, mainScreenViewModel: MainScreenViewModel) {

    val encodedSuperVillain = mainScreenViewModel.encodedSuperVillain.collectAsStateWithLifecycle()
    val decodedSuperVillain = mainScreenViewModel.decodedSuperVillain.collectAsStateWithLifecycle()

    Column(
        modifier = Modifier
            .padding(contentPadding)
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Text(
            modifier = Modifier
                .background(
                    color = Color.LightGray,
                    shape = RoundedCornerShape(8.dp)
                )
                .padding(16.dp)
                .fillMaxWidth(),
            text = encodedSuperVillain.value,
            minLines = 4,
            color = Color.Black,
        )

        Spacer(
            modifier = Modifier.height(16.dp)
        )


        Text(
            modifier = Modifier
                .background(
                    color = Color.LightGray,
                    shape = RoundedCornerShape(8.dp)
                )
                .padding(16.dp)
                .fillMaxWidth(),
            text = decodedSuperVillain.value?.toString() ?: "N/A",
            minLines = 4,
            color = Color.Black,
        )

        HorizontalDivider(
            modifier = Modifier.padding(vertical = 16.dp)
        )

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Button(
                onClick = {
                    decodedSuperVillain.value?.let {
                        val superVillainStr = Json.encodeToString(it)
                        mainScreenViewModel.updateEncodedSuperVillain(superVillainStr)
                    }
                }
            ) {
                Text(
                    text = "Encode"
                )
            }

            Spacer(
                modifier = Modifier.width(16.dp)
            )

            Button(
                onClick = {
                    try {
                        val superVillain =
                            Json.decodeFromString<SuperVillain>(encodedSuperVillain.value)
                        mainScreenViewModel.updateDecodedSuperVillain(superVillain)

                    } catch (e: Exception) {
                        println(e.stackTrace.contentToString())
                    }
                }
            ) {
                Text(
                    text = "Decode"
                )
            }
        }

    }
}