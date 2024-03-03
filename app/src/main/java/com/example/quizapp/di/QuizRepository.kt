package com.example.quizapp.di

import com.example.quizapp.model.QuizResponse

interface QuizRepository {
    suspend fun getQuiz(
        category: Int,
        difficulty: String,
    ): Result<QuizResponse?>
}


