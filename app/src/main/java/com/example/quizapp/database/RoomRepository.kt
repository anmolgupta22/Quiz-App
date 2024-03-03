package com.example.quizapp.database


import com.example.quizapp.database.dao.QuizDao
import javax.inject.Inject


open class RoomRepository @Inject constructor(
    private val quizDao: QuizDao,
) {

}