fun main() {
    val numbers = listOf(2, 3, 4, 5)
    val product = numbers.fold(1) { acc, num -> acc * num }
    println("Product: $product")
}

