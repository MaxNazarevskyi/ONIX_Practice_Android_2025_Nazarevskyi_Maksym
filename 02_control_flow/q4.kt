fun factorial(n: Int): Long {
    return if (n <= 1) 1 else n * factorial(n - 1)
}

fun main() {
    print("Number to factorial:")
    val input = readlnOrNull()?.toInt()

    if (input != null && input >= 0) {
        println("Factorial $input: ${factorial(input)}")
    } else {
        println("Incorrect number")
    }
}
