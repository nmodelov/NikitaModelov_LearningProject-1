package ru.apps65.learningproject.di.components

import dagger.Subcomponent
import ru.apps65.learningproject.detailcharacter.di.CharacterDetailModule
import ru.apps65.learningproject.detailcharacter.presentation.CharacterDetailFragment
import ru.apps65.learningproject.di.scope.PerPresenter
import ru.apps65.learningproject.main.MainActivity

@PerPresenter
@Subcomponent(modules = [CharacterDetailModule::class])
interface PresentationComponent {

    fun inject(activity: MainActivity)

    fun inject(characterDetailFragment: CharacterDetailFragment)

    @Subcomponent.Factory
    interface Factory {
        fun create(): PresentationComponent
    }
}