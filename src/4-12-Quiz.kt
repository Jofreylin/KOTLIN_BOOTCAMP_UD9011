

data class SpiceContainer(val spice: NewSpice) {
    val label: String
        get() = spice.name
}

fun main() {
    val curry = Curry("spicy")
    val container = SpiceContainer(curry)
    println("Spice container label: ${container.label}")
}

abstract class NewSpice(val name: String, val spiciness: String)

class Curry(spiciness: String) : NewSpice("Curry", spiciness)
