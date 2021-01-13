package ru.apps65.learningproject.detailcharacter.di

import dagger.Component
import ru.apps65.learningproject.detailcharacter.presentation.CharacterDetailFragment

@Component(modules = [CharacterDetailModule::class])
interface CharacterDetailComponent {

    fun inject(characterDetailFragment: CharacterDetailFragment)
}