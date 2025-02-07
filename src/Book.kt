open class Book(val title: String, val author: String) {
    private var currentPage: Int = 0

    open fun readPage() {
        currentPage++
        println("Reading page $currentPage of $title")
    }
}

class eBook(title: String, author: String, val format: String = "text") : Book(title, author) {
    private var wordCount: Int = 0

    override fun readPage() {
        wordCount += 250
        println("Reading eBook: $title, Word count: $wordCount")
    }
}


fun main() {
    val book = Book("The Hobbit", "J.R.R. Tolkien")
    book.readPage()

    val ebook = eBook("Harry Potter", "J.K. Rowling")
    ebook.readPage()
}