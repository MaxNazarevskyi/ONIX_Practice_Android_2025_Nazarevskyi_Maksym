import kotlinx.coroutines.*
import kotlin.random.Random

suspend fun fetchDataWithRetry(maxRetries: Int = 3, delayMillis: Long = 1000): String {
    var attempt = 0

    repeat(maxRetries) {
        attempt++
        try {
            println("Attempt #$attempt: Fetching data...")
            return fetchData()  // Виклик основної функції
        } catch (e: Exception) {
            println("Attempt #$attempt failed: ${e.message}")
            if (attempt < maxRetries) {
                delay(delayMillis * attempt)  // Затримка перед повторною спробою
                println("Retrying... (Attempt #${attempt + 1})")
            }
        }
    }

    throw Exception("Failed after $maxRetries attempts")
}

// Функція, що симулює запит до сервера
suspend fun fetchData(): String {
    delay(500)  // Симулюємо мережеву затримку
    if (Random.nextBoolean()) throw Exception("Network error!")  // Іноді викликаємо помилку
    return "Data received successfully!"
}

fun main() = runBlocking {
    try {
        val result = fetchDataWithRetry()
        println("Final result: $result")
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
}
