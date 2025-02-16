class Box<T> {
    private var item: T? = null

    fun add(item: T) {
        this.item = item
    }

    fun retrieve(): T? {
        return item
    }
}

fun main() {
    val intBox = Box<Int>()
    intBox.add(42)
    println("Integer Box contains: ${intBox.retrieve()}")

    val stringBox = Box<String>()
    stringBox.add("Hello, Kotlin!")
    println("String Box contains: ${stringBox.retrieve()}")

    val doubleBox = Box<Double>()
    doubleBox.add(3.23)
    println("Double Box contains: ${doubleBox.retrieve()}")
}
