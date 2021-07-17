package com.raywenderlich.android.librarian.database.dao

import androidx.room.*
import com.raywenderlich.android.librarian.model.ReadingList

@Dao
interface ReadingListDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addReadingList(readingList: ReadingList)

    @Query("SELECT * FROM readinglist")
    fun getReadListing(): List<ReadingList>

    @Delete
    fun removeReadingList(readingList: ReadingList)
}