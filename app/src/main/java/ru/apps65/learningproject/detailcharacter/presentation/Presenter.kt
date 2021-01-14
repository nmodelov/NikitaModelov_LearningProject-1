package ru.apps65.learningproject.detailcharacter.presentation

import ru.apps65.learningproject.detailcharacter.presentation.CharactersDetailView

interface Presenter {

    fun loadData(id: Int)
    fun navigateBack()
    fun attach(view: CharactersDetailView)
    fun dettach()
}