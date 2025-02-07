package spices

abstract class NewSpice(val name: String, val spiciness: String) : SpiceColor {
    abstract fun prepareSpice()
}

class Curry(spiciness: String) : NewSpice("Curry", spiciness), Grinder, SpiceColor by YellowSpiceColor {
    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
        println("Grinding the curry into powder.")
    }
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: String
}

object YellowSpiceColor : SpiceColor {
    override val color = "yellow"
}
