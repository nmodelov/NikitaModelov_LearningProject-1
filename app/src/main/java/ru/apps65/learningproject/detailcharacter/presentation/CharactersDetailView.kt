package ru.apps65.learningproject.detailcharacter.presentation

import ru.apps65.learningproject.detailcharacter.domain.entity.Character

interface CharactersDetailView {

    fun setData(character: Character)
}