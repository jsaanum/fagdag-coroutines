package basics

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    launch { suspendFn() }
}

suspend fun suspendFn() {
    delay(1000)
    println("Hello from suspend function")
}