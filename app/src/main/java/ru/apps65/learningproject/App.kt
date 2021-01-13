package ru.apps65.learningproject

import android.app.Application

class App : Application() {

    companion object {

        lateinit var component: AppComponent
            private set
    }

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.create()
    }
}