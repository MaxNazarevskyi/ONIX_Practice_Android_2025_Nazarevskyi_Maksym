fun findMinMax(numbers: List<Int>): Pair<Int, Int>? {
    return if (numbers.isNotEmpty()) {
        numbers.min() to numbers.max() // Використовуємо стандартні функції min() та max()
    } else {
        null // Якщо список порожній, повертаємо null
    }
}

fun main() {
    val numbers = listOf(10, 5, 8, 3, 12, 7)

    val result = findMinMax(numbers)

    if (result != null) {
        val (minValue, maxValue) = result
        println("Мінімальне значення: $minValue")
        println("Максимальне значення: $maxValue")
    } else {
        println("Список порожній!")
    }
}
