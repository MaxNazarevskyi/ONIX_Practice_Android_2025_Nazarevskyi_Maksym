data class Book(val title: String, val author: String, val price: Double)

fun main() {
    val books = listOf(
        Book("Factorial", "John Fector", 25.0),
        Book("Advanced Kotlin", "Jane Smith", 18.5),
        Book("Android Development", "Alex Johnson", 15.0),
        Book("Data Structures in Kotlin", "Emily Davis", 30.0)
    )

    val affordableBooks = books.filter { it.price < 20 }

    affordableBooks.forEach { println(it) }
}

