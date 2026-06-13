package com.example.sharedpreferencesanddatastore.sharedpreferences_tut

import android.content.Context
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.core.content.edit
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey

@Composable
fun SharedPreferencesScreen(modifier: Modifier) {

    val context = LocalContext.current

    val sharedPref = context.getSharedPreferences("SharedPreferences", Context.MODE_PRIVATE)
    var name by remember { mutableStateOf<String?>("") }
    var age by remember { mutableIntStateOf(0) }

    val masterKey = MasterKey.Builder(context)
        .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
        .build()

    val encryptedSharedPref = EncryptedSharedPreferences.create(
        context,
        "EncryptedSharedPreferences",
        masterKey,
        EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
        EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM,
    )
    var encryptedName by remember { mutableStateOf<String?>("") }
    var encryptedAge by remember { mutableIntStateOf(0) }

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Button(
            onClick = {
                encryptedSharedPref.apply {
                    edit {
                        putString("name", "Pro")
                        putInt("age", 21)
                    }
                }
            }
        ) {
            Text(
                text = "Save Data in Encrypted Shared Preferences."
            )
        }

        Spacer(
            modifier = Modifier.height(20.dp),
        )


        Button(
            onClick = {
                encryptedSharedPref.apply {
                    encryptedName = getString("name", "N/A")
                    encryptedAge = getInt("age", -1)
                }
            }
        ) {
            Text(
                text = "Get Data in Encrypted Shared Preferences."
            )
        }

        Text(
            text = "Name $encryptedName"
        )

        Text(
            text = "Age $encryptedAge"
        )

        HorizontalDivider(
            modifier = Modifier.padding(vertical = 24.dp)
        )

        Button(
            onClick = {
                sharedPref.apply {
                    edit {
                        putString("name", "Pro")
                        putInt("age", 22)
                    }
                }
            }
        ) {
            Text(
                text = "Save Data in Shared Preferences."
            )
        }

        Spacer(
            modifier = Modifier.height(20.dp),
        )


        Button(
            onClick = {
                sharedPref.apply {
                    name = getString("name", "N/A")
                    age = getInt("age", -1)
                }
            }
        ) {
            Text(
                text = "Get Data in Shared Preferences."
            )
        }

        Text(
            text = "Name $name"
        )

        Text(
            text = "Age $age"
        )
    }
}