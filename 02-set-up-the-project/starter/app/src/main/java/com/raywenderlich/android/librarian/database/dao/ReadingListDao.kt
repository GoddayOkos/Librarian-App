package com.raywenderlich.android.librarian.database.dao

import androidx.room.*
import com.raywenderlich.android.librarian.model.ReadingList
import kotlinx.coroutines.flow.Flow

@Dao
interface ReadingListDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addReadingList(readingList: ReadingList)

    @Query("SELECT * FROM readinglist")
    suspend fun getReadListing(): List<ReadingList>

    @Transaction
    @Query("SELECT * FROM readinglist")
    fun getReadingListFlow(): Flow<List<ReadingList>>

    @Delete
    suspend fun removeReadingList(readingList: ReadingList)

    @Query("SELECT * FROM readinglist WHERE id = :listId")
    suspend fun getReadingListById(listId: String): ReadingList

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateReadingList(newReadingList: ReadingList)
}