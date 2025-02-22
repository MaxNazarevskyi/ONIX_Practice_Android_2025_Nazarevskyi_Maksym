import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.full.findAnnotation

fun getSerializableProperties(obj: Any) {
    val kClass = obj::class
    val serializableProps = kClass.declaredMemberProperties
        .filter { it.findAnnotation<Serializable>() != null }

    println("Serializable properties of ${kClass.simpleName}:")
    serializableProps.forEach { println("- ${it.name}") }
}

