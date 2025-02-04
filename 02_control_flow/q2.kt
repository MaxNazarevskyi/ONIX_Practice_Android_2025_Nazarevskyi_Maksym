fun main() {
    val n = 10
    var first = 0
    var second = 1

    print("First $n Fibonacci numbers: $first, $second")

    for (i in 3..n) {
        val next = first + second
        print(", $next")
        first = second
        second = next
    }
}
