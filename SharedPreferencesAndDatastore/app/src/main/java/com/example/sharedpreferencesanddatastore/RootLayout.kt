package com.example.sharedpreferencesanddatastore

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DataObject
import androidx.compose.material.icons.filled.FolderShared
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sharedpreferencesanddatastore.datastore_tut.DataStoreScreen
import com.example.sharedpreferencesanddatastore.sharedpreferences_tut.SharedPreferencesScreen

@Composable
fun RootLayout() {

    val navController = rememberNavController()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar(

            ) {
                NavigationBarItem(
                    selected = false,
                    onClick = {
                        navController.navigate(NavRoutes.SharedPreferences)
                    },
                    icon = {
                        Icon(
                            imageVector = Icons.Default.FolderShared,
                            contentDescription = "Folder Shared"
                        )
                    },
                    label = {
                        Text(text = "Shared Prefs")
                    }
                )

                NavigationBarItem(
                    selected = false,
                    onClick = {
                        navController.navigate(NavRoutes.DataStore)
                    },
                    icon = {
                        Icon(
                            imageVector = Icons.Default.DataObject,
                            contentDescription = "DataStore"
                        )
                    },
                    label = {
                        Text(text = "DataStore")
                    }
                )
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = NavRoutes.SharedPreferences,
        ) {
            composable<NavRoutes.SharedPreferences> {
                SharedPreferencesScreen(modifier = Modifier.padding(innerPadding))
            }

            composable<NavRoutes.DataStore> {
                DataStoreScreen(modifier = Modifier.padding(innerPadding))
            }
        }
    }
}