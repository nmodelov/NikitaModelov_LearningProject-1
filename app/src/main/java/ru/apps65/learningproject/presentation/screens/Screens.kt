package ru.apps65.learningproject.presentation.screens

import com.github.terrakok.cicerone.androidx.FragmentScreen
import ru.apps65.learningproject.presentation.characterscreen.CharactersFragment
import ru.apps65.learningproject.presentation.detailcharacter.CharacterDetailFragment

object Screens {
    fun CharactersScreen() = FragmentScreen { CharactersFragment() }
    fun CharacterDetailScreen() = FragmentScreen { CharacterDetailFragment() }
}