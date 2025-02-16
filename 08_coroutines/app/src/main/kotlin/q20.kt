import kotlinx.coroutines.*

suspend fun fetchFirstApi(): String {
    delay(1000) // Симуляція мережевого запиту
    return "Response from API 1"
}

suspend fun fetchSecondApi(): String {
    delay(1200) // Симуляція мережевого запиту
    return "Response from API 2"
}

suspend fun fetchData(): String = coroutineScope {
    val firstResponse = async { fetchFirstApi() }
    val secondResponse = async { fetchSecondApi() }

    // Очікуємо обидві відповіді та комбінуємо їх
    "Combined Result: ${firstResponse.await()} + ${secondResponse.await()}"
}

fun main() = runBlocking {
    println("Fetching data...")
    val result = fetchData()
    println(result)
}
