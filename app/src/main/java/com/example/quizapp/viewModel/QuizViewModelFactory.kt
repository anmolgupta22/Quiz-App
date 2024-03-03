package com.example.quizapp.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.quizapp.database.RoomRepository
import com.example.quizapp.di.QuizRepository
import javax.inject.Inject

class QuizViewModelFactory @Inject constructor(
    private val instance: QuizRepository,
    private val roomRepository: RoomRepository,
) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(QuizRepository::class.java, RoomRepository::class.java)
            .newInstance(instance, roomRepository)
    }
}