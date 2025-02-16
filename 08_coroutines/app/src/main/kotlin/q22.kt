import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        repeat(10) { i ->
            if (!isActive) return@launch
            println("Working on task... Step $i")
            delay(1000L)
        }
    }

    delay(3500L)
    println("Cancelling the job...")
    job.cancelAndJoin()
    println("Job cancelled. Exiting.")
}
