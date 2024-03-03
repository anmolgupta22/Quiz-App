package com.example.quizapp.di

import com.example.quizapp.database.RoomRepository
import com.example.quizapp.viewModel.QuizViewModel
import dagger.Module
import dagger.Provides


@Module
class RepositoryModule {
    @Provides
    fun provideQuizRepository(apiService: ApiService): QuizRepository {
        return QuizRepositoryImpl(apiService)
    }

    @Provides
    fun provideMyViewModel(
        quizRepository: QuizRepository,
        roomRepository: RoomRepository,
    ): QuizViewModel {
        return QuizViewModel(quizRepository, roomRepository)
    }

}
