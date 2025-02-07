package Books // Changed package name to avoid conflicts

class Book(val title: String, val author: String, val year: Int) {
    fun getTitleAndAuthor(): Pair<String, String> {
        return Pair(title, author)
    }

    fun getBookDetails(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}

fun main() {
    val book = Book("1984", "George Orwell", 1949)
    val (title, author) = book.getTitleAndAuthor()
    val (fullTitle, fullAuthor, year) = book.getBookDetails()

    println("Here is your book $fullTitle written by $fullAuthor in $year.")
}
