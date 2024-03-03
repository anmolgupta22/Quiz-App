package com.example.quizapp.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\f"}, d2 = {"Lcom/example/quizapp/di/RepositoryModule;", "", "()V", "provideMyViewModel", "Lcom/example/quizapp/viewModel/QuizViewModel;", "quizRepository", "Lcom/example/quizapp/di/QuizRepository;", "roomRepository", "Lcom/example/quizapp/database/RoomRepository;", "provideStarWarsRepository", "apiService", "Lcom/example/quizapp/di/ApiService;", "app_debug"})
@dagger.Module()
public final class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.quizapp.di.QuizRepository provideStarWarsRepository(@org.jetbrains.annotations.NotNull()
    com.example.quizapp.di.ApiService apiService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.quizapp.viewModel.QuizViewModel provideMyViewModel(@org.jetbrains.annotations.NotNull()
    com.example.quizapp.di.QuizRepository quizRepository, @org.jetbrains.annotations.NotNull()
    com.example.quizapp.database.RoomRepository roomRepository) {
        return null;
    }
}