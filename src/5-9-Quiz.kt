package LibraryV2

import java.util.*

// Changed package name to avoid conflicts


const val MAX_BORROWED_BOOKS = 5

class Book(val title: String, val author: String, val year: Int, var pages: Int) {
    fun canBorrow(borrowedBooks: Int): Boolean {
        return borrowedBooks < MAX_BORROWED_BOOKS
    }

    fun printUrl() {
        println("${Companion.BASE_URL}$title.html")
    }

    companion object {
        private const val BASE_URL = "https://librarycatalog.com/"
    }
}

fun Book.weight(): Double = pages * 1.5

fun Book.tornPages(torn: Int) {
    pages = if (pages - torn >= 0) pages - torn else 0
}

class Puppy {
    fun playWithBook(book: Book) {
        val tornPages = Random().nextInt(10)+1
        println("Puppy tore $tornPages pages from ${book.title}")
        book.tornPages(tornPages)
    }
}

fun main() {
    val book = Book("Harry potter", "J.K. Rowling", 2000, 400)
    val puppy = Puppy()

    println("Initial book weight: ${book.weight()} grams")
    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("Remaining pages: ${book.pages}")
    }
    println("The book has no more pages left.")
}
