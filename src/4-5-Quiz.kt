class Spice(val name: String, val spiciness: String = "mild") {
    val heat: Int
        get() = when (spiciness) {
            "not spicy" -> 1
            "mild" -> 5
            "medium" -> 7
            "spicy" -> 10
            "very spicy" -> 15
            else -> 0
        }

    init {
        println("Spice: $name, Spiciness: $spiciness, Heat: $heat")
    }
}

fun makeSalt() = Spice("Salt", "not spicy")

fun main() {
    val spices = listOf(
        Spice("Curry", "mild"),
        Spice("Chili", "very spicy"),
        Spice("Paprika", "medium"),
    )

    val mildOrLess = spices.filter { it.heat <= 5 }
    println("Mild or less spicy: ${mildOrLess.map { it.name }}")

    val salt = makeSalt()
    println("Created spice: ${salt.name}, Heat level: ${salt.heat}")
}
