package com.example.q2

fun getStringLength(input: String?): Int {
    if (input != null) {
        return input.length
    }
    return -1 // if string is null, return -1
}

fun main() {
    val strings: List<String?> = listOf("Max", null, "Android", "", null)

    for (str in strings) {
        println("String: " + str + " -> Length: " + getStringLength(str))
    }
}

