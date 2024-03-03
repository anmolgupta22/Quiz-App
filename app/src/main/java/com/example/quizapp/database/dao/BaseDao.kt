package com.example.quizapp.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.Companion.REPLACE
import androidx.room.Update


@Dao
interface BaseDao<T> {

    @Insert(onConflict = REPLACE)
    fun insertAll(score: List<T>)

    @Insert(onConflict = REPLACE)
    fun insert(score: T): Long

    @Update(onConflict = REPLACE)
    fun update(score: T): Int

    @Delete
    fun delete(score: T): Int
}