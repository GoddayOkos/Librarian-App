package com.raywenderlich.android.librarian.database.converters

import androidx.room.TypeConverter
import java.util.*

class DateConverter {

    @TypeConverter
    fun fromTimestamp(value: Long?): Date = Date(value ?: 0)

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long = date?.time ?: 0
}