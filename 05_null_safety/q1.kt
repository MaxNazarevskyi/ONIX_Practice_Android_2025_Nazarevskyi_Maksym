fun sumOfList(numbers: List<Int>?): Int {
    return numbers?.sum() ?: 0
}

fun main() {
    val list1: List<Int>? = listOf(1, 2, 3, 4, 5)
    val list2: List<Int>? = null
    val list3: List<Int>? = emptyList()

    println(sumOfList(list1))
    println(sumOfList(list2))
    println(sumOfList(list3))
}
