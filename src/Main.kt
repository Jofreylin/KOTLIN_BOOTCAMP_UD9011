import java.util.*

fun main(args: Array<String>) {
    dayOfWeek()
    greetings(12)

    println("\nYour fortune is: ${getFortuneCookie()}")
}

fun dayOfWeek(){
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    var dayName = "";

    dayName = when (day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Not day"
    }

    println("What day is it today? $dayName")
}

fun greetings(hour: Int){
    println("${ if (hour < 12) "Good Morning, Kotlin" else "Good Night, Kotlin" } ")
}

fun getFortuneCookie(): String{
    val fortunes = listOf("You will have a great day!", "Things will go well for you today.", "Enjoy a wonderful day of success.")
    print( "Enter your birthday: ")

    val birthday = readLine()?.toIntOrNull() ?: 1

    val index = birthday % fortunes.size
    return fortunes[index]
}
