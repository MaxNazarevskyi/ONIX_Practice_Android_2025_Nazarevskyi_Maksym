package com.example.q3

class Person(val name: String, val age: Int)

fun main() {
    val person = Person("Max", 21)

    println("Name: ${person.name}, Age: ${person.age}")
}