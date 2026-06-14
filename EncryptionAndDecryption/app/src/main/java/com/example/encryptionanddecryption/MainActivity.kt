package com.example.encryptionanddecryption

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.encryptionanddecryption.ui.theme.EncryptionAndDecryptionTheme
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EncryptionAndDecryptionTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainScreen(innerPadding)
                }
            }
        }
    }
}

@Composable
fun MainScreen(innerPadding: PaddingValues) {

    val context = LocalContext.current

    var messageToEncrypt by remember { mutableStateOf("") }
    var messageToDecrypt by remember { mutableStateOf("") }

    val cryptoManager = CryptoManager()

    Column(
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        TextField(
            value = messageToEncrypt,
            onValueChange = { messageToEncrypt = it }
        )

        Row(
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            Button(
                onClick = {
                    val bytes = messageToEncrypt.encodeToByteArray()
                    val file = File(context.filesDir, "secret.txt")

                    if (!file.exists()) {
                        file.createNewFile()
                    }

                    val fos = FileOutputStream(file)

                    messageToDecrypt = cryptoManager
                        .encrypt(
                            bytes,
                            fos
                        )
                        .decodeToString()

                    messageToEncrypt = ""
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue,
                )
            ) {
                Text(
                    text = "Encrypt"
                )
            }

            Button(
                onClick = {
                    val file = File(context.filesDir, "secret.txt")

                    if (!file.exists()) {
                        return@Button
                    }

                    val fis = FileInputStream(file)
                    messageToEncrypt = cryptoManager
                        .decrypt(fis)
                        .decodeToString()
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue,
                )
            ) {
                Text(
                    text = "Decrypt"
                )
            }
        }

        Text(
            text = messageToDecrypt
        )
    }
}