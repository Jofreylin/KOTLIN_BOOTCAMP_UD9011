package spicesV2 // Changed package name to avoid conflicts

enum class SpiceColor(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00)
}

sealed class Spice(val name: String, val spiciness: String, val color: SpiceColor)

data class SpiceContainer(val spice: Spice) {
    val label: String
        get() = spice.name
}

fun main() {
    val curry = Curry("spicy")
    val container = SpiceContainer(curry)
    println("Spice container label: ${container.label}, Color: ${curry.color}")
}

class Curry(spiciness: String) : Spice("Curry", spiciness, SpiceColor.YELLOW)