package com.example.quizapp.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u001f\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\bX\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0002\n\u0000R\"\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\f8F\u00f8\u0001\u0000\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/example/quizapp/viewModel/QuizViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/quizapp/di/QuizRepository;", "roomRepository", "Lcom/example/quizapp/database/RoomRepository;", "(Lcom/example/quizapp/di/QuizRepository;Lcom/example/quizapp/database/RoomRepository;)V", "_quizQuestion", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Result;", "Lcom/example/quizapp/model/QuizResponse;", "quizQuestion", "Landroidx/lifecycle/LiveData;", "getQuizQuestion", "()Landroidx/lifecycle/LiveData;", "getQuizRequest", "", "category", "", "difficulty", "", "app_debug"})
public final class QuizViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.quizapp.di.QuizRepository repository = null;
    private final com.example.quizapp.database.RoomRepository roomRepository = null;
    private final androidx.lifecycle.MutableLiveData<kotlin.Result<com.example.quizapp.model.QuizResponse>> _quizQuestion = null;
    
    @javax.inject.Inject()
    public QuizViewModel(@org.jetbrains.annotations.NotNull()
    com.example.quizapp.di.QuizRepository repository, @org.jetbrains.annotations.NotNull()
    com.example.quizapp.database.RoomRepository roomRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Result<com.example.quizapp.model.QuizResponse>> getQuizQuestion() {
        return null;
    }
    
    public final void getQuizRequest(int category, @org.jetbrains.annotations.NotNull()
    java.lang.String difficulty) {
    }
}