fun main(){
    val spice = SimpleSpice()
    println("Spice: ${spice.name}, Heat: ${spice.heat}")
}

class SimpleSpice {
    val name: String = "Curry"
    val spiciness: String = "mild"
    val heat: Int
        get() = 5
}