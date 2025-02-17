fun sumNumbers(vararg numbers: Int): Int {
    return numbers.sum()
}

fun main() {
    val result = sumNumbers(1, 2, 3, 4, 5)
    println("Sum: $result")
}
