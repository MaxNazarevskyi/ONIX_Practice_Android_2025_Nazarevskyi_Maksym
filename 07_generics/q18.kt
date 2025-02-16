fun <T> printList(items: List<T>) {
    for (item in items) {
        println(item)
    }
}

fun main() {
    val intList = listOf(1, 2, 3, 4, 5)
    val stringList = listOf("Kotlin", "Java", "Swift")
    val doubleList = listOf(3.14, 2.71, 1.618)

    println("Integer List:")
    printList(intList)

    println("\nString List:")
    printList(stringList)

    println("\nDouble List:")
    printList(doubleList)
}
