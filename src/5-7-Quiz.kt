package Library // Changed package name to avoid conflicts

const val MAX_BORROWED_BOOKS = 5
const val BASE_URL = "https://librarycatalog.com/"

class Book(val title: String, val author: String, val year: Int) {
    fun canBorrow(borrowedBooks: Int): Boolean {
        return borrowedBooks < MAX_BORROWED_BOOKS
    }

    fun printUrl() {
        println("${BASE_URL}$title.html")
    }

}

fun main() {
    val book = Book("Harry-Potter", "J.K. Rowling", 2000)
    println("Can borrow more books: ${book.canBorrow(3)}")
    book.printUrl()
}
