package ru.apps65.learningproject.detailcharacter.domain.repository

import ru.apps65.learningproject.detailcharacter.domain.entity.Character

interface CharactersDetailRepository {

    fun getCharacterById(id: Int): Character
}