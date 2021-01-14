package ru.apps65.learningproject.detailcharacter.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import ru.apps65.learningproject.detailcharacter.data.CharacterDetailRepositoryImpl
import ru.apps65.learningproject.detailcharacter.domain.repository.CharactersDetailRepository
import ru.apps65.learningproject.detailcharacter.presentation.CharacterDetailPresenter
import ru.apps65.learningproject.detailcharacter.presentation.Presenter


@InstallIn(FragmentComponent::class)
@Module
abstract class CharacterDetailModule {

    @Binds
    abstract fun providePresenter(presenter: CharacterDetailPresenter): Presenter

    @Binds
    abstract fun provideRepository(repository: CharacterDetailRepositoryImpl): CharactersDetailRepository
}