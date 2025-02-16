interface Drawable {
    fun draw()
}

class Circle : Drawable {
    override fun draw() {
        println("Drawing a Circle")
    }
}

class Square : Drawable {
    override fun draw() {
        println("Drawing a Square")
    }
}

fun main() {
    val shapes: List<Drawable> = listOf(Circle(), Square())
    for (shape in shapes) {
        shape.draw()
    }
}