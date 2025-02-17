fun <T> List<T>.myFilter(predicate: (T) -> Boolean): List<T> {
    val result = mutableListOf<T>()
    for (item in this) {
        if (predicate(item)) {
            result.add(item)
        }
    }
    return result
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val evens = numbers.myFilter { it % 2 == 0 }
    println(evens)

    val greaterThanFive = numbers.myFilter { it > 5 }
    println(greaterThanFive)
}