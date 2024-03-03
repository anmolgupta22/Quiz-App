package com.example.quizapp.database.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.quizapp.model.Score

@Dao
interface QuizDao : BaseDao<Score> {

}