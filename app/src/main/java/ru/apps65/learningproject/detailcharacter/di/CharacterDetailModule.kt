package ru.apps65.learningproject.detailcharacter.di

import dagger.Module
import dagger.Provides
import ru.apps65.learningproject.detailcharacter.data.CharacterDetailRepositoryImpl
import ru.apps65.learningproject.detailcharacter.domain.repository.CharactersDetailRepository
import ru.apps65.learningproject.detailcharacter.presentation.CharacterDetailPresenter
import ru.apps65.learningproject.detailcharacter.presentation.Presenter

@Module
class CharacterDetailModule {

    @Provides
    fun providePresenter(repository: CharactersDetailRepository): Presenter =
        CharacterDetailPresenter(repository)

    @Provides
    fun provideRepository(): CharactersDetailRepository =
        CharacterDetailRepositoryImpl()
}