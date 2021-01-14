package ru.apps65.learningproject.detailcharacter.di

import dagger.Binds
import dagger.Module
import ru.apps65.learningproject.detailcharacter.data.CharacterDetailRepositoryImpl
import ru.apps65.learningproject.detailcharacter.domain.repository.CharactersDetailRepository
import ru.apps65.learningproject.detailcharacter.presentation.CharacterDetailPresenter
import ru.apps65.learningproject.detailcharacter.presentation.Presenter
import ru.apps65.learningproject.di.scope.PerPresenter

// Так тоже можно!

//@Module
//class CharacterDetailModule {
//
//    @PerPresenter
//    @Provides
//    fun providePresenter(repository: CharactersDetailRepository, router: Router): Presenter =
//        CharacterDetailPresenter(repository, router)
//
//    @Provides
//    fun provideRepository(): CharactersDetailRepository =
//        CharacterDetailRepositoryImpl()
//}

@Module
abstract class CharacterDetailModule {

    @PerPresenter
    @Binds
    abstract fun providePresenter(presenter: CharacterDetailPresenter): Presenter

    @Binds
    abstract fun provideRepository(repository: CharacterDetailRepositoryImpl): CharactersDetailRepository
}