package com.raywenderlich.android.librarian.repository

import com.raywenderlich.android.librarian.model.Book
import com.raywenderlich.android.librarian.model.Genre
import com.raywenderlich.android.librarian.model.ReadingList
import com.raywenderlich.android.librarian.model.Review
import com.raywenderlich.android.librarian.model.relations.BookAndGenre
import com.raywenderlich.android.librarian.model.relations.BookReview
import com.raywenderlich.android.librarian.model.relations.ReadingListsWithBooks

interface LibrarianRepository {

    suspend fun addBook(book: Book)

    suspend fun getBooks(): List<BookAndGenre>

    fun getBookById(bookId: String): Book

    suspend fun removeBook(book: Book)

    fun getGenres(): List<Genre>

    fun getGenreById(genreId: String): Genre

    fun addGenres(genres: List<Genre>)

    fun addReview(review: Review)

    fun removeReview(review: Review)

    fun getReviewById(reviewId: String): BookReview

    fun getReviews(): List<BookReview>

    fun updateReview(review: Review)

    suspend fun addReadingList(readingList: ReadingList)

    suspend fun getReadingLists(): List<ReadingListsWithBooks>

    suspend fun removeReadingList(readingList: ReadingList)

    fun getBooksByGenre(genreId: String): List<BookAndGenre>

    fun getBooksByRating(rating: Int): List<BookAndGenre>
}