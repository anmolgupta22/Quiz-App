package com.example.quizapp

import android.app.Application
import com.example.quizapp.di.ApiModule
import com.example.quizapp.di.AppComponent
import com.example.quizapp.di.DaggerAppComponent

class MyApplication : Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
            .apiModule(ApiModule(this))
            .build()
    }

}