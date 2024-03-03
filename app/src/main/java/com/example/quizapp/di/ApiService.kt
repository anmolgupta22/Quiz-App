package com.example.quizapp.di

import com.example.quizapp.model.QuizResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("/api.php")
    suspend fun getQuiz(
        @Query("amount") amount: Int,
        @Query("category") category: Int,
        @Query("difficulty") difficulty: String,
        @Query("type") type: String,
    ): Response<QuizResponse>
}