package ru.apps65.learningproject.detailcharacter.presentation

import ru.apps65.learningproject.detailcharacter.domain.entity.Character
import ru.apps65.learningproject.detailcharacter.domain.repository.CharactersDetailRepository

class CharacterDetailPresenter(
    private val repository: CharactersDetailRepository
) : Presenter {

    private lateinit var character: Character
    private var view: CharactersDetailView? = null

    override fun loadData(id: Int) {
        character = repository.getCharacterById(id)
        view?.setData(character)
    }

    override fun navigateBack() {
        getRouter().exit()
    }

    override fun attach(view: CharactersDetailView) {
        this.view = view
    }

    override fun dettach() {
        view = null
    }
}