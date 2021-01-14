package ru.apps65.learningproject.di.components

import dagger.Component
import ru.apps65.learningproject.di.modules.NavigationModule
import javax.inject.Singleton

@Singleton
@Component(modules = [NavigationModule::class])
interface AppComponent {

    val presentationComponent: PresentationComponent.Factory
}