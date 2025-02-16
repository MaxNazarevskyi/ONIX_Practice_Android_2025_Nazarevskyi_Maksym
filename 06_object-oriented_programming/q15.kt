abstract class Shape {
    abstract fun area(): Double
}

class Circles(private val radius: Double) : Shape() {
    override fun area(): Double = Math.PI * radius * radius
}

class Rectangles(private val width: Double, private val height: Double) : Shape() {
    override fun area(): Double = width * height
}

fun main() {
    val circle = Circles(5.0)
    val rectangle = Rectangles(4.0, 6.0)

    println("Circle area: ${circle.area()}")
    println("Rectangle area: ${rectangle.area()}")
}

