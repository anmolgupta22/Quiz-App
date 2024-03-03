package com.example.quizapp.di

import android.app.Application
import com.example.quizapp.database.DBHelper
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Provides
    @Singleton
    fun providesDatabase(application: Application) = DBHelper.getInstance(application)

    @Provides
    @Singleton
    fun providesQuizDao(database: DBHelper) = database.characterDao()

}
