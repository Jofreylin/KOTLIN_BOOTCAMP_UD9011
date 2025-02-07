import java.util.*


fun main(){
    val rollDice = {  Random().nextInt(12) + 1 }

    val rollDice1 = { sides: Int ->
        Random().nextInt(sides) + 1
    }

    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }


    println(rollDice())
    println(rollDice1(6))

    gamePlay(rollDice2)
}


fun gamePlay(roll: (Int) -> Int) {
    println("Roll: ${roll(6)}")
}
