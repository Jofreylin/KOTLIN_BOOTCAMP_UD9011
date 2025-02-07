fun main() {
    val allBooks = setOf("Hamlet", "Macbeth")
    val library = mapOf("William Shakespeare" to allBooks)

    println("Does the library contain Hamlet? ${library.any { it.value.contains("Hamlet") }}")

}
