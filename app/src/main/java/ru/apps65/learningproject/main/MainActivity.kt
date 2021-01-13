package ru.apps65.learningproject.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.github.terrakok.cicerone.Command
import com.github.terrakok.cicerone.Replace
import com.github.terrakok.cicerone.androidx.AppNavigator
import ru.apps65.learningproject.App
import ru.apps65.learningproject.R
import ru.apps65.learningproject.characters.presentation.charactersScreen
import ru.apps65.learningproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val navigator = object : AppNavigator(this, R.id.main_container) {
        override fun setupFragmentTransaction(
            fragmentTransaction: FragmentTransaction,
            currentFragment: Fragment?,
            nextFragment: Fragment?
        ) {
            super.setupFragmentTransaction(fragmentTransaction, currentFragment, nextFragment)
            fragmentTransaction.setReorderingAllowed(true)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        navigator.applyCommands(arrayOf<Command>(Replace(charactersScreen())))
    }

    override fun onResume() {
        super.onResume()
        App.INSTANCE.navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        App.INSTANCE.navigatorHolder.removeNavigator()
        super.onPause()
    }
}