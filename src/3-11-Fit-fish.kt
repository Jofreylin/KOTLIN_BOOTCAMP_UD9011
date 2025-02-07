fun main() {

    println(fitMoreFish(10.0, listOf(3,3,3))) // false
    println(fitMoreFish(8.0, listOf(2,2,2), hasDecorations = false)) // true
    println(fitMoreFish(9.0, listOf(1,1,3), 3)) // false
    println(fitMoreFish(10.0, listOf(), 7, true)) // true
}

fun fitMoreFish(
    tankSize: Double,
    currentFish: List<Int>,
    fishSize: Int = 2,
    hasDecorations: Boolean = true): Boolean {
    val max = if (hasDecorations) tankSize * 0.8 else tankSize
    val currentSize = currentFish.sum() + fishSize
    return currentSize <= max
}
