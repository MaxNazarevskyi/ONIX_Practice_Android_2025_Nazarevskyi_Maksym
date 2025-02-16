fun printString(input: String?) {
    println(if (input.isNullOrBlank()) "Empty" else input)
}

fun main() {
    printString("Hello, Kotlin!")
    printString("")
    printString(null)
    printString("   ")
}
