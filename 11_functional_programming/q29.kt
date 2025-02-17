fun main() {
    val sentences = listOf(
        "Kotlin is awesome",
        "FlatMap helps in transformation",
        "Functional programming is powerful"
    )

    val words = sentences.flatMap { it.split(" ") }

    println(words)
}
