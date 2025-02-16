fun main() {
    val numbers = listOf(10, 3, 7, 2, 5, 8, 1, 9)
    val oddSorted = numbers.filter { it % 2 != 0 }.sortedByDescending { it }
    println(oddSorted)
}

