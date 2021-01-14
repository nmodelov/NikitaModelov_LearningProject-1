package ru.apps65.learningproject

import android.app.Application
import ru.apps65.learningproject.di.components.AppComponent
import ru.apps65.learningproject.di.components.DaggerAppComponent

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.create()
    }

    companion object {
        lateinit var component: AppComponent
            private set
    }
}