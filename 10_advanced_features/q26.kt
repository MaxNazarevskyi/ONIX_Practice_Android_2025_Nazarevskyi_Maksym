import kotlin.system.measureTimeMillis

inline fun measureExecutionTime(block: () -> Unit): Long {
    return measureTimeMillis {
        block()
    }
}

fun main() {
    val time = measureExecutionTime {
        Thread.sleep(500) // simulation 
        println("Operation completed!")
    }
    println("Execution time: $time ms")
}
