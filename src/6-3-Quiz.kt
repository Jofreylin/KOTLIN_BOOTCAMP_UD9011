package Game // Changed package name to avoid conflicts

enum class Directions {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game {
    private var path = mutableListOf(Directions.START)

    private val north = { path.add(Directions.NORTH) }
    private val south = { path.add(Directions.SOUTH) }
    private val east = { path.add(Directions.EAST) }
    private val west = { path.add(Directions.WEST) }

    private val end = {
        path.add(Directions.END)
        println("Game Over: $path")
        path.clear()
        false
    }

    fun play() {
        println(path)
        north()
        south()
        east()
        west()
        end()
        println(path)
    }
}

fun main() {
    val game = Game()
    game.play()
}
