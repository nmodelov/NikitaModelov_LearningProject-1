package ru.apps65.learningproject

import dagger.Component
import ru.apps65.learningproject.main.MainActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [NavigationModule::class])
interface AppComponent {

    fun inject(activity: MainActivity)
}