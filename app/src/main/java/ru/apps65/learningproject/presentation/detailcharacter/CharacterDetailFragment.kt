package ru.apps65.learningproject.presentation.detailcharacter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import ru.apps65.learningproject.databinding.FragmentDetailCharacterBinding
import ru.apps65.learningproject.presentation.common.BaseFragment
import ru.apps65.learningproject.utils.getRouter

class CharacterDetailFragment: BaseFragment<FragmentDetailCharacterBinding>() {

    override fun binding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): FragmentDetailCharacterBinding = FragmentDetailCharacterBinding.inflate(inflater, container, false)

    override fun otherSetups() {
        binding.backButton.setOnClickListener {
            getRouter().exit()
        }
    }
}