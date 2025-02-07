import java.lang.Math.random

fun main() {
    println(whatShouldIDoToday("happy"))
    println(whatShouldIDoToday("sad", "rainy", 10.0))
    println(whatShouldIDoToday("excited", "cloudy", 18.0))

   
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Double = 24.0): String {
    return when {
        mood == "happy" && weather == "sunny" -> "Go for a walk!"
        mood == "sad" && weather == "rainy" && temperature < 15 -> "Stay home and read."
        isVeryHot(temperature) -> "Go swimming!"
        isFreezing(temperature) -> "Stay inside and keep warm!"
        isColdAndRainy(mood, weather, temperature) -> "Stay in bed."
        else -> "Just relax"
    }
}

fun isVeryHot(temperature: Double) = temperature > 35
fun isFreezing(temperature: Double) = temperature == 0.0
fun isColdAndRainy(mood: String, weather: String, temperature: Double) = mood == "sad" && weather == "rainy" && temperature == 0.0