package ru.apps65.learningproject.common

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB : ViewBinding> : Fragment() {

    var binding: VB? = null
        get() = field ?: throw NullPointerException("Binding can't be null")
        private set

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = binding(inflater, container, savedInstanceState)
        otherSetups()
        return binding?.root
    }

    protected open fun otherSetups() {}

    protected abstract fun binding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): VB

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}