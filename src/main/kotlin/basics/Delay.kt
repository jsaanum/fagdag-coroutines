package basics

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {

    launch {
        delay(100L)
        println("This is a delayed message")
    }

    launch {
        println("Hello world!")
    }

}