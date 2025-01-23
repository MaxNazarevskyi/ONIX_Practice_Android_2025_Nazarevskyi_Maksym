package com.example.q1
import kotlin.math.sqrt

fun isPrime(num: Int) = when {
    num < 2 -> false
    num == 2 -> true
    num % 2 == 0 -> false
    else -> (3..sqrt(num.toDouble()).toInt() step 2).none { num % it == 0 }
}

fun main() {
    print("Print number: ")
    val input = readlnOrNull()?.toIntOrNull()
    if (input != null) {
        val result = if (isPrime(input)) "is prime" else "not prime"
        println("Number " + input + " " + result + ".")
    } else {
        println("incorrect!")
    }
}
