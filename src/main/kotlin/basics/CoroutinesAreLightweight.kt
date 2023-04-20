package basics

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {

    launch {
        // Launching 50 000 OS-threads via the Java Thread API would've cost several gigabytes of memory

        repeat(50_000) {
            delay(1000)
            println("Hello")
        }
    }

}