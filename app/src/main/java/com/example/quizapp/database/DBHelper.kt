package com.example.quizapp.database

import android.content.Context
import androidx.room.*
import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.quizapp.database.dao.QuizDao
import com.example.quizapp.model.Score

@Database(
    entities = [Score::class],
    version = 1,
    exportSchema = false
)

abstract class DBHelper : RoomDatabase() {

    abstract fun characterDao(): QuizDao

    companion object {

        private var appDataBaseInstance: DBHelper? = null

        @Synchronized
        fun getInstance(context: Context): DBHelper {
            if (appDataBaseInstance == null) {
                appDataBaseInstance = Room.databaseBuilder(
                    context.applicationContext,
                    DBHelper::class.java,
                    "tbl_quiz"
                )
                    .allowMainThreadQueries()
                    .build()
            }
            return appDataBaseInstance!!
        }
    }
}