fun main() {
    print("Number: ")
    val number = readLine()?.toIntOrNull()

    when {
        number == null -> println("Write integer number.")
        number % 2 == 0 -> println("Even")
        else -> println("Odd")
    }
}
