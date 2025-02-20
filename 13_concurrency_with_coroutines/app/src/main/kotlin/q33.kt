import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

suspend fun runConcurrentTasks() = coroutineScope {
    val channel = Channel<String>(capacity = Channel.UNLIMITED) // Канал для збору результатів

    val jobs = listOf(
        async { fetchData(1, 1000, channel) },
        async { fetchData(2, 700, channel) },
        async { fetchData(3, 500, channel) }
    )

    jobs.forEach { it.await() } // Чекаємо на всі завдання
    channel.close() // Закриваємо канал після завершення всіх задач

    for (result in channel) { // Читаємо дані у порядку завершення
        println(result)
    }
}

suspend fun fetchData(id: Int, delayMillis: Long, channel: Channel<String>) {
    delay(delayMillis)
    channel.send("Task #$id completed in ${delayMillis}ms")
}

fun main() = runBlocking {
    println("Starting tasks...")
    runConcurrentTasks()
}