interface Drivable {
    fun drive()
}

class Driver : Drivable {
    override fun drive() {
        println("The driver is driving the car.")
    }
}

class Car(private val driver: Drivable) : Drivable by driver

fun main() {
    val driver = Driver()
    val car = Car(driver)
    car.drive()
}