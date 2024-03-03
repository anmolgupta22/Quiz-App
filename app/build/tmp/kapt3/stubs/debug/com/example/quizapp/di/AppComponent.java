package com.example.quizapp.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/example/quizapp/di/AppComponent;", "", "inject", "", "fragment", "Lcom/example/quizapp/ui/QuizFragment;", "Lcom/example/quizapp/ui/SelectCategoriesFragment;", "Lcom/example/quizapp/ui/StudentDetailsFragment;", "app_debug"})
@dagger.Component(modules = {com.example.quizapp.di.ApiModule.class, com.example.quizapp.di.RepositoryModule.class, com.example.quizapp.di.DatabaseModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.quizapp.ui.StudentDetailsFragment fragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.quizapp.ui.SelectCategoriesFragment fragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.quizapp.ui.QuizFragment fragment);
}