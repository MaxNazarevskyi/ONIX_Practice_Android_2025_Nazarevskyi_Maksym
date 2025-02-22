import kotlin.reflect.full.declaredMemberProperties

fun printProperties(obj: Any) {
    val kClass = obj::class
    println("Properties of ${kClass.simpleName}:")
    kClass.declaredMemberProperties.forEach { prop ->
        println("${prop.name} = ${prop.getter.call(obj)}")
    }
}

data class Person2(val name: String, val age: Int, val city: String)

fun main() {
    val person = Person2("Max", 28, "Kyiv")
    printProperties(person)
}
