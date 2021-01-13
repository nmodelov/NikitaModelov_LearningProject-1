package ru.apps65.learningproject.detailcharacter.data

import ru.apps65.learningproject.detailcharacter.domain.repository.CharactersDetailRepository
import ru.apps65.learningproject.detailcharacter.domain.entity.Character

class CharacterDetailRepositoryImpl : CharactersDetailRepository {

    private val charactersList = listOf(
        Character(id = 1, name = "Человек-паук", colorEye = "Зеленые", 25),
        Character(id = 2, name = "Доктор Стрэндж", colorEye = "Зеленые", 47),
        Character(id = 3, name = "Звездный лорд", colorEye = "Зеленые", 32),
        Character(id = 4, name = "Танос", colorEye = "Зеленые", 1000)
    )

    override fun getCharacterById(id: Int): Character = charactersList.single { it.id == id }
}