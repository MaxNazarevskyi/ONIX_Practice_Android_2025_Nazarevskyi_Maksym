import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Starting coroutine...")

    launch {
        delay(1000L)
        println("Task 1 completed after 1 second")
    }

    launch {
        delay(2000L)
        println("Task 2 completed after 2 seconds")
    }

    launch {
        delay(1500L)
        println("Task 3 completed after 1.5 seconds")
    }

    println("All tasks launched!")
}
