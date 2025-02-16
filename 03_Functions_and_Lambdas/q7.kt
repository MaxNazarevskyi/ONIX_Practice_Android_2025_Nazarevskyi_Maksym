fun applyDiscount(price: Double, discountFunction: (Double) -> Double): Double {
    return discountFunction(price)
}

fun main() {
    val discountLambda: (Double) -> Double = { price -> price * 0.9 }

    val finalPrice = applyDiscount(80.0, discountLambda)

    println("Final price after discount: $finalPrice")
}
