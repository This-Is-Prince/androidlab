package com.example.kotincoroutines

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.time.Duration.Companion.seconds

class MainScreenViewModel : ViewModel() {

    private val _fbFollowersUsingLaunch = MutableStateFlow<Int?>(null)
    val fbFollowersUsingLaunch = _fbFollowersUsingLaunch.asStateFlow()

    private var fbFollowersUsingLaunchJob: Job? = null

    private val _fbFollowersUsingAsync = MutableStateFlow<Int?>(null)
    val fbFollowersUsingAsync = _fbFollowersUsingAsync.asStateFlow()

    private var fbFollowersUsingAsyncJob: Job? = null

    fun fetchFbFollowersUsingLaunch() {
        fbFollowersUsingLaunchJob?.cancel()

        fbFollowersUsingLaunchJob = viewModelScope.launch {
            println("fetchFbFollowersUsingLaunch Before ${Thread.currentThread().name}")

            val result = withContext(Dispatchers.IO) {
                delay(10L.seconds)

                println("fetchFbFollowersUsingLaunch Inside withContext ${Thread.currentThread().name}")

                25
            }

            _fbFollowersUsingLaunch.value = result

            println("fetchFbFollowersUsingLaunch After ${Thread.currentThread().name}")
        }
    }

    fun fetchFbFollowersUsingAsync() {
        fbFollowersUsingAsyncJob?.cancel()

        fbFollowersUsingAsyncJob = viewModelScope.launch {
            println("fetchFbFollowersUsingAsync Before ${Thread.currentThread().name}")

            val result = withContext(Dispatchers.IO) {
                val first = async {
                    delay(10L.seconds)

                    27
                }

                val second = async {
                    delay(15L.seconds)

                    12
                }

                val result = first.await() + second.await()

                println("fetchFbFollowersUsingAsync Inside withContext ${Thread.currentThread().name}")

                result
            }

            _fbFollowersUsingAsync.value = result

            println("fetchFbFollowersUsingAsync After ${Thread.currentThread().name}")
        }
    }
}