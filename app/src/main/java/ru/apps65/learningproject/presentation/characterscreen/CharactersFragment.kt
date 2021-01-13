package ru.apps65.learningproject.presentation.characterscreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import ru.apps65.learningproject.databinding.FragmentCharactersBinding
import ru.apps65.learningproject.presentation.common.BaseFragment
import ru.apps65.learningproject.presentation.screens.Screens
import ru.apps65.learningproject.utils.getRouter

class CharactersFragment: BaseFragment<FragmentCharactersBinding>() {

    override fun binding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): FragmentCharactersBinding =FragmentCharactersBinding.inflate(inflater, container, false)

    override fun otherSetups() {
        binding.buttonToDetail.setOnClickListener {
            getRouter().navigateTo(Screens.CharacterDetailScreen())
        }
    }
}