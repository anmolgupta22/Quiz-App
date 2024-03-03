package com.example.quizapp.di

import android.util.Log
import com.example.quizapp.model.QuizResponse
import javax.inject.Inject

class QuizRepositoryImpl @Inject constructor(private val apiService: ApiService) :
    QuizRepository {

    override suspend fun getQuiz(
        category: Int,
        difficulty: String,
    ): Result<QuizResponse?> {
        return try {
            val response = apiService.getQuiz(11, category, difficulty, "multiple")
            Log.d("TAG", "getQuiz: check the response $response")
            if (response.isSuccessful && response.body() != null) {
                Result.success(response.body())
            } else {
                // Handle other API response errors
                Result.failure(Exception("Failed to fetch characters. Response code: ${response.code()}"))
            }
        } catch (e: NoConnectivityException) {
            // Handle network-related errors
            Result.failure(Exception("No internet connection"))
        } catch (e: Exception) {
            Result.failure(Exception("Exception: ${e.message}"))
        }
    }

}
