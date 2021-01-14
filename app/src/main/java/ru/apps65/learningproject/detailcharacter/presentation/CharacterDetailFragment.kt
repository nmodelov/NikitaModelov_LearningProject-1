package ru.apps65.learningproject.detailcharacter.presentation

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import ru.apps65.learningproject.App
import ru.apps65.learningproject.common.BaseFragment
import ru.apps65.learningproject.databinding.FragmentDetailCharacterBinding
import ru.apps65.learningproject.detailcharacter.domain.entity.Character
import javax.inject.Inject

class CharacterDetailFragment : BaseFragment<FragmentDetailCharacterBinding>(),
    CharactersDetailView {

    @Inject
    lateinit var presenter: Presenter

    override fun binding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): FragmentDetailCharacterBinding =
        FragmentDetailCharacterBinding.inflate(inflater, container, false)

    override fun otherSetups() {

        App.component.presentationComponent.create().inject(this)

        presenter.attach(this)

        binding?.backButton?.setOnClickListener {
            presenter.navigateBack()
        }

        binding?.dataButton?.setOnClickListener {
            presenter.loadData((1..4).random())
        }
    }

    @SuppressLint("SetTextI18n")
    override fun setData(character: Character) {
        binding?.textLabel?.text = "Имя: ${character.name}\n" +
                "Цвет глаз: ${character.colorEye}\n" +
                "Лет: ${character.age}"
    }

    override fun onDestroyView() {
        presenter.dettach()
        super.onDestroyView()
    }
}