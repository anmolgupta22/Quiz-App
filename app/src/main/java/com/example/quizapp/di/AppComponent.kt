package com.example.quizapp.di

import com.example.quizapp.ui.QuizFragment
import com.example.quizapp.ui.SelectCategoriesFragment
import com.example.quizapp.ui.StudentDetailsFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApiModule::class, RepositoryModule::class, DatabaseModule::class])
interface AppComponent {
    fun inject(fragment: StudentDetailsFragment)
    fun inject(fragment: SelectCategoriesFragment)
    fun inject(fragment: QuizFragment)
}